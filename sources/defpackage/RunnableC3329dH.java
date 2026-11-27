package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.PictureDrawable;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import com.bumptech.glide.a;
import com.google.android.material.bottomsheet.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: dH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC3329dH implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC3329dH(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                ComponentActivity this$0 = (ComponentActivity) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!Intrinsics.a(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e2) {
                    if (!Intrinsics.a(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 1:
                ((EditText) obj).clearFocus();
                return;
            case 2:
                QF1.e().d(((C2688aH1) obj).getFlushTimeoutMillis());
                return;
            case 3:
                ((AbstractC5709oN1) obj).E();
                return;
            case 4:
                DialogInterface dialogInterface = (DialogInterface) obj;
                Intrinsics.c(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                ((b) dialogInterface).f().C(3);
                return;
            default:
                CW1 cw1 = (CW1) obj;
                ImageView imageView = cw1.d;
                KW1 kw1 = C3435dm0.a;
                Intrinsics.checkNotNullParameter(imageView, "<this>");
                if (C4952km0.b == null) {
                    C4952km0.b = new C4952km0();
                }
                C4952km0 c4952km0 = C4952km0.b;
                Context context = imageView.getContext();
                c4952km0.getClass();
                C4274hm0 c4274hm0 = (C4274hm0) a.c(context);
                c4274hm0.getClass();
                c4952km0.a = new C4064gm0(c4274hm0.d, c4274hm0, PictureDrawable.class, c4274hm0.e).U(AbstractC2634a20.c).V(new DW1());
                ((C6025ps1) ((C4064gm0) ((C4064gm0) C4952km0.b.a).S(cw1.e)).t(cw1.g)).N(imageView);
                return;
        }
    }
}
