package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.savedstate.a;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogC4636jH extends Dialog implements FP0, Q81, OC1 {

    @Nullable
    public l d;

    @NotNull
    public final NC1 e;

    @NotNull
    public final OnBackPressedDispatcher g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC4636jH(@NotNull Context context, int i) {
        super(context, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(this, "owner");
        this.e = new NC1(this);
        this.g = new OnBackPressedDispatcher(new RunnableC4378iH(this, 0));
    }

    public static void a(DialogC4636jH this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        super.addContentView(view, layoutParams);
    }

    public final void b() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        N7.u(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        ED.n(decorView3, this);
    }

    @Override // defpackage.FP0
    @NotNull
    public final g getLifecycle() {
        l lVar = this.d;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this);
        this.d = lVar2;
        return lVar2;
    }

    @Override // defpackage.Q81
    @NotNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.g;
    }

    @Override // defpackage.OC1
    @NotNull
    public final a getSavedStateRegistry() {
        return this.e.b;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.g.c();
    }

    @Override // android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher invoker = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(invoker, "onBackInvokedDispatcher");
            OnBackPressedDispatcher onBackPressedDispatcher = this.g;
            onBackPressedDispatcher.getClass();
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            onBackPressedDispatcher.e = invoker;
            onBackPressedDispatcher.d(onBackPressedDispatcher.g);
        }
        this.e.b(bundle);
        l lVar = this.d;
        if (lVar == null) {
            lVar = new l(this);
            this.d = lVar;
        }
        lVar.f(g.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    @NotNull
    public final Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.e.c(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        l lVar = this.d;
        if (lVar == null) {
            lVar = new l(this);
            this.d = lVar;
        }
        lVar.f(g.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        l lVar = this.d;
        if (lVar == null) {
            lVar = new l(this);
            this.d = lVar;
        }
        lVar.f(g.a.ON_DESTROY);
        this.d = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        b();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(@NotNull View view, @Nullable ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        b();
        super.setContentView(view, layoutParams);
    }
}
