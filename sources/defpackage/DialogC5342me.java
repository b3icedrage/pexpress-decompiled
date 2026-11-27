package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;

/* JADX INFO: renamed from: me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogC5342me extends DialogC4636jH implements InterfaceC2057Td {
    public LayoutInflaterFactory2C3192ce h;
    public final C5129le i;

    /* JADX WARN: Type inference failed for: r2v2, types: [le] */
    public DialogC5342me(@NonNull Context context, int i) {
        int i2;
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = i;
        }
        super(context, i2);
        this.i = new C4388iK0.a() { // from class: le
            @Override // defpackage.C4388iK0.a
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return this.d.d(keyEvent);
            }
        };
        AbstractC2759ae abstractC2759aeC = c();
        if (i == 0) {
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            i = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C3192ce) abstractC2759aeC).Y = i;
        abstractC2759aeC.n();
    }

    @Override // defpackage.DialogC4636jH, android.app.Dialog
    public final void addContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        c().c(view, layoutParams);
    }

    @NonNull
    public final AbstractC2759ae c() {
        if (this.h == null) {
            C0585Ah.a aVar = AbstractC2759ae.d;
            this.h = new LayoutInflaterFactory2C3192ce(getContext(), getWindow(), this, this);
        }
        return this.h;
    }

    public final boolean d(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().o();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C4388iK0.b(this.i, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final <T extends View> T findViewById(int i) {
        return (T) c().f(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().l();
    }

    @Override // defpackage.DialogC4636jH, android.app.Dialog
    public void onCreate(Bundle bundle) {
        c().k();
        super.onCreate(bundle);
        c().n();
    }

    @Override // defpackage.DialogC4636jH, android.app.Dialog
    public final void onStop() {
        super.onStop();
        c().p();
    }

    @Override // defpackage.DialogC4636jH, android.app.Dialog
    public void setContentView(int i) {
        c().s(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().w(charSequence);
    }

    @Override // defpackage.DialogC4636jH, android.app.Dialog
    public void setContentView(@NonNull View view) {
        c().t(view);
    }

    @Override // defpackage.DialogC4636jH, android.app.Dialog
    public void setContentView(@NonNull View view, ViewGroup.LayoutParams layoutParams) {
        c().u(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        c().w(getContext().getString(i));
    }
}
