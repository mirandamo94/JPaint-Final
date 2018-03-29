# JPaint
Simple Paint function with Java using Object Oriented Design Principals

Notes   on   Pattern
There   were   four   noticeable   patterns   implemented   in   my   design: Abstract   Factory   Pattern:
● “ Abstract   Factory   patterns   work   around   a   super-factory   which   creates   other   factories. This   factory   is   also   called   as   factory   of   factories.   This   type   of   design   pattern   comes   under creational   pattern   as   this   pattern   provides   one   of   the   best   ways   to   create   an   object. ” -TutorialsPoint
● Used   in   createShapeCommand,   this   class   works   around   IShapeFactory   which   extends class   ShapeFactory   that   contains   the   creation   and   flow   of   Shape,   IViewShape,   and IDisplayableShape.   The   class   createShapeCommand   has   a   startingPoint   and   an endingPoint   (extended   from   IStartAndEndPointCommand)   as   foundation   data   for   new shapes   to   be   created.   The   shapes   of   this   class   holds   start   and   ending   point,   primary   color and   secondary   color.
Observer   Pattern:
● “Observer   pattern   is   used   when   there   is   one-to-many   relationship   between   objects   such   as
if   one   object   is   modified,   its   depenedent   objects   are   to   be   notified   automatically.
Observer   pattern   falls   under   behavioral   pattern   category.”   -TutorialsPoint
● To   use   this   pattern   in   ShapeList,   I   had   an   interface   IShapeList   which   provides   a   contract
for   classes   that   use   it   to   work   with.   The   addToList   method   will   add   the   new IDisplayableShape   to   the   list   of   IDisplayableShapes   in   ShapeList,   then   call notifyObservers   to   notify   the   PaintCanvas.
● Observer   pattern   uses   three   actor   classes.   Subject,   Observer   and   Client.   My   subject, ShapeList,   is   an   object   having   methods   to   attach   and   detach   observers   to   a   client   object, which   is   PaintCanvas.   I   created   two   abstract   class   IShapeList   and   IDisplayableShape   that are   extending   class   Subject.
Command   Pattern:
● “Command   pattern   is   a   data   driven   design   pattern   and   falls   under   behavioral   pattern
category.   A   request   is   wrapped   under   an   object   as   command   and   passed   to   invoker object.   Invoker   object   looks   for   the   appropriate   object   which   can   handle   this   command and   passes   the   command   to   the   corresponding   object   which   executes   the command.”-TutorialsPoint
● To   implement   this   pattern,   I   created   the   FilledShape,   FilledAndOutlineShape,   and OutlineShape   which   extends   from   IDisplayableShape   interface,   these   classes   have   the method   DisplayFilled()   or   DisplayOutline(),   or   both,   when   it’s   called,   Invoker   will   look
for   these   Shapes   based   on   what   user   selected   on   canvas   to   choose   which IDisplayableShape   from   the   list   is   most   appropriate   to   use   and   display().
Adapter   Pattern
● “Adapter   pattern   works   as   a   bridge   between   two   incompatible   interfaces.   This   type   of
design   pattern   comes   under   structural   pattern   as   this   pattern   combines   the   capability   of
two   independent   interfaces.”   TutorialsPoint
● I   implemented   this   pattern   when   I   made   the   ColorAdapter   class,   which   contains   a
Java.awt.Color   object   and   a   string   color   name.   This   is   to   prevent   any   foreseeable   problem such   as   if   I   need   to   change   color   functionality,   I   could   assign   a   name   to   the   Color   I   was creating   e.g.”BLACK”
