package defpackage;

import android.content.DialogInterface;
import com.google.android.material.bottomsheet.b;
import io.sentry.android.core.performance.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: iR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4408iR implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC4408iR(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                DialogInterface dialogInterface = (DialogInterface) this.e;
                Intrinsics.c(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                ((b) dialogInterface).f().C(3);
                break;
            case 1:
                M02.m10queryBoughtItems$lambda0((M02) this.e);
                break;
            case 2:
                ((C7040ui2.a) this.e).a.destroy();
                break;
            default:
                ((h) this.e).g();
                break;
        }
    }
}
