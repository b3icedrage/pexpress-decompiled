package defpackage;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class P41 implements Window.Callback {
    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(@Nullable MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(@Nullable KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(@Nullable KeyEvent keyEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(@Nullable AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(@Nullable MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        return false;
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final View onCreatePanelView(int i) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, @NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        return false;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i, @Nullable View view, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        return false;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return false;
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final ActionMode onWindowStartingActionMode(@Nullable ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(@Nullable SearchEvent searchEvent) {
        return false;
    }

    @Override // android.view.Window.Callback
    @Nullable
    public final ActionMode onWindowStartingActionMode(@Nullable ActionMode.Callback callback, int i) {
        return null;
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(@Nullable ActionMode actionMode) {
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(@Nullable ActionMode actionMode) {
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(@Nullable WindowManager.LayoutParams layoutParams) {
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
    }
}
