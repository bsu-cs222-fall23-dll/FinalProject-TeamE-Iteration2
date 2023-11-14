# FinalProject-TeamE-Iteration2

Created new repository for the second iteration of the final project due to the problem with pushing our commits

Authors: David Chen, Sunghoo Hong, Alex Bousman

This program is supposed to run a fully-functioning and full-featured graphing calculator. This includes standard arithmetic operations, along with trigonometry, and other special functions, to generate solutions and graphs for equations.

Build and Run Instructions: Run the GraphingCalculator class

Branches
-'sunghoohong': This branch contains all the commits

Error that we are having:

Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException: Cannot invoke "String.isEmpty()" because "org.example.RegularCalculator.operator" is null
	at org.example.ButtonClickListener.actionPerformed(ButtonClickListener.java:81)
	at java.desktop/javax.swing.AbstractButton.fireActionPerformed(AbstractButton.java:1972)
	at java.desktop/javax.swing.AbstractButton$Handler.actionPerformed(AbstractButton.java:2313)
	at java.desktop/javax.swing.DefaultButtonModel.fireActionPerformed(DefaultButtonModel.java:405)
	at java.desktop/javax.swing.DefaultButtonModel.setPressed(DefaultButtonModel.java:262)
	at java.desktop/javax.swing.plaf.basic.BasicButtonListener.mouseReleased(BasicButtonListener.java:279)
	at java.desktop/java.awt.Component.processMouseEvent(Component.java:6620)
	at java.desktop/javax.swing.JComponent.processMouseEvent(JComponent.java:3398)
	at java.desktop/java.awt.Component.processEvent(Component.java:6385)
	at java.desktop/java.awt.Container.processEvent(Container.java:2266)
	at java.desktop/java.awt.Component.dispatchEventImpl(Component.java:4995)
	at java.desktop/java.awt.Container.dispatchEventImpl(Container.java:2324)
	at java.desktop/java.awt.Component.dispatchEvent(Component.java:4827)
	at java.desktop/java.awt.LightweightDispatcher.retargetMouseEvent(Container.java:4948)
	at java.desktop/java.awt.LightweightDispatcher.processMouseEvent(Container.java:4575)
	at java.desktop/java.awt.LightweightDispatcher.dispatchEvent(Container.java:4516)
	at java.desktop/java.awt.Container.dispatchEventImpl(Container.java:2310)
	at java.desktop/java.awt.Window.dispatchEventImpl(Window.java:2780)
	at java.desktop/java.awt.Component.dispatchEvent(Component.java:4827)
	at java.desktop/java.awt.EventQueue.dispatchEventImpl(EventQueue.java:775)
	at java.desktop/java.awt.EventQueue$4.run(EventQueue.java:720)
	at java.desktop/java.awt.EventQueue$4.run(EventQueue.java:714)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:399)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:86)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:97)
	at java.desktop/java.awt.EventQueue$5.run(EventQueue.java:747)
	at java.desktop/java.awt.EventQueue$5.run(EventQueue.java:745)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:399)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:86)
	at java.desktop/java.awt.EventQueue.dispatchEvent(EventQueue.java:744)
	at java.desktop/java.awt.EventDispatchThread.pumpOneEventForFilters(EventDispatchThread.java:203)
	at java.desktop/java.awt.EventDispatchThread.pumpEventsForFilter(EventDispatchThread.java:124)
	at java.desktop/java.awt.EventDispatchThread.pumpEventsForHierarchy(EventDispatchThread.java:113)
	at java.desktop/java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:109)
	at java.desktop/java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:101)
	at java.desktop/java.awt.EventDispatchThread.run(EventDispatchThread.java:90)
Exception in thread "AWT-EventQueue-0" java.lang.NullPointerException: Cannot invoke "String.hashCode()" because "<local7>" is null
	at org.example.ButtonClickListener.actionPerformed(ButtonClickListener.java:45)
	at java.desktop/javax.swing.AbstractButton.fireActionPerformed(AbstractButton.java:1972)
	at java.desktop/javax.swing.AbstractButton$Handler.actionPerformed(AbstractButton.java:2313)
	at java.desktop/javax.swing.DefaultButtonModel.fireActionPerformed(DefaultButtonModel.java:405)
	at java.desktop/javax.swing.DefaultButtonModel.setPressed(DefaultButtonModel.java:262)
	at java.desktop/javax.swing.plaf.basic.BasicButtonListener.mouseReleased(BasicButtonListener.java:279)
	at java.desktop/java.awt.Component.processMouseEvent(Component.java:6620)
	at java.desktop/javax.swing.JComponent.processMouseEvent(JComponent.java:3398)
	at java.desktop/java.awt.Component.processEvent(Component.java:6385)
	at java.desktop/java.awt.Container.processEvent(Container.java:2266)
	at java.desktop/java.awt.Component.dispatchEventImpl(Component.java:4995)
	at java.desktop/java.awt.Container.dispatchEventImpl(Container.java:2324)
	at java.desktop/java.awt.Component.dispatchEvent(Component.java:4827)
	at java.desktop/java.awt.LightweightDispatcher.retargetMouseEvent(Container.java:4948)
	at java.desktop/java.awt.LightweightDispatcher.processMouseEvent(Container.java:4575)
	at java.desktop/java.awt.LightweightDispatcher.dispatchEvent(Container.java:4516)
	at java.desktop/java.awt.Container.dispatchEventImpl(Container.java:2310)
	at java.desktop/java.awt.Window.dispatchEventImpl(Window.java:2780)
	at java.desktop/java.awt.Component.dispatchEvent(Component.java:4827)
	at java.desktop/java.awt.EventQueue.dispatchEventImpl(EventQueue.java:775)
	at java.desktop/java.awt.EventQueue$4.run(EventQueue.java:720)
	at java.desktop/java.awt.EventQueue$4.run(EventQueue.java:714)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:399)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:86)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:97)
	at java.desktop/java.awt.EventQueue$5.run(EventQueue.java:747)
	at java.desktop/java.awt.EventQueue$5.run(EventQueue.java:745)
	at java.base/java.security.AccessController.doPrivileged(AccessController.java:399)
	at java.base/java.security.ProtectionDomain$JavaSecurityAccessImpl.doIntersectionPrivilege(ProtectionDomain.java:86)
	at java.desktop/java.awt.EventQueue.dispatchEvent(EventQueue.java:744)
	at java.desktop/java.awt.EventDispatchThread.pumpOneEventForFilters(EventDispatchThread.java:203)
	at java.desktop/java.awt.EventDispatchThread.pumpEventsForFilter(EventDispatchThread.java:124)
	at java.desktop/java.awt.EventDispatchThread.pumpEventsForHierarchy(EventDispatchThread.java:113)
	at java.desktop/java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:109)
	at java.desktop/java.awt.EventDispatchThread.pumpEvents(EventDispatchThread.java:101)
	at java.desktop/java.awt.EventDispatchThread.run(EventDispatchThread.java:90)
