# DIT-3-1-DeLeonJasmineRobelle-Act07

1. What did you learn about using Fragments and Navigation Components?

Using Fragments with the Navigation Component taught me a lot about modern Android app architecture:

Simplified navigation: The Navigation Component handles fragment transactions automatically, so I don’t have to manually write FragmentManager.beginTransaction(). This reduces bugs and makes the code cleaner.

Back stack management: It automatically manages the back stack, pop behavior, and “up” navigation. I learned how popUpTo and launchSingleTop work to prevent multiple copies of the same fragment.

Safe args: Using Safe Args helps pass data between fragments safely and in a type-safe manner, avoiding runtime crashes due to wrong bundle keys or types.

Integration with UI components: It works seamlessly with BottomNavigationView and Toolbar, making it easy to highlight the current destination and manage app bars dynamically.

Key takeaway: Navigation Components encourage a single-source-of-truth navigation structure, which is much easier to maintain for larger apps.

2. How did you make your UI adaptive to screen size or orientation?

To ensure the UI works across different devices and orientations, I applied the following strategies:

ConstraintLayout and Compose modifiers: I used ConstraintLayout (in XML) or responsive Compose layouts like Box, Column, Row, and Modifier.fillMaxSize() / weight() to adapt to different screen sizes.

Window size classes: I checked window width/height classes to adjust layouts for tablets vs. phones (for example, showing side-by-side content on larger screens).

Dynamic padding and spacing: I used Modifier.padding() and Modifier.fillMaxWidth() dynamically so that elements don’t overflow or look squished on smaller devices.

Orientation handling: By using remember and onConfigurationChanged in Compose, or res/layout-land XML resources in traditional UI, I ensured the layout adapts when switching between portrait and landscape.

Scrollable components: For smaller screens, I wrapped content in LazyColumn or ScrollView to prevent clipping.

Key takeaway: Responsive UI design ensures the app looks good on all devices and orientations, providing a smooth user experience.

3. What challenges did you face when combining Bottom Navigation and Tabs?

Combining Bottom Navigation and Tabs (TopAppBar tabs) can be tricky because both manage different layers of navigation:

Fragment back stack conflicts: Bottom Navigation swaps fragments, while tabs usually swap internal content inside a fragment. Managing the back stack correctly to preserve tab states when switching bottom nav items was challenging.

State restoration: Without proper state handling (saveState and restoreState), switching between bottom nav items would reset tab positions, causing a poor user experience.

Navigation hierarchy complexity: It was challenging to decide whether tabs should be nested fragments or just Compose pages inside a fragment. Nesting fragments sometimes caused childFragmentManager issues.

UI consistency: Ensuring the tabs’ selected state and bottom nav selection remain in sync required careful management, especially when navigating deep into a tab and then switching bottom nav items.

How I solved it:

Used single activity + multiple fragments pattern with Navigation Component.

Enabled saveState = true and restoreState = true when navigating between bottom nav items.

Kept tabs inside fragments as internal stateful composables (in Compose) or ViewPager2 in XML, ensuring tab selection is preserved.

Key takeaway: Bottom Navigation defines the primary app sections, while Tabs define secondary sections inside each screen. Proper state management is crucial for a smooth UX.
