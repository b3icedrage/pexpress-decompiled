package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.widget.ImageView;
import kotlin.Unit;

/* JADX INFO: renamed from: bm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3016bm0 implements InterfaceC1088Gs1<Drawable> {
    public final /* synthetic */ Handler d;
    public final /* synthetic */ ImageView e;
    public final /* synthetic */ String g;
    public final /* synthetic */ int h;
    public final /* synthetic */ C2424Xl0 i;

    public C3016bm0(Handler handler, ImageView imageView, String str, int i, C2424Xl0 c2424Xl0) {
        this.d = handler;
        this.e = imageView;
        this.g = str;
        this.h = i;
        this.i = c2424Xl0;
    }

    @Override // defpackage.InterfaceC1088Gs1
    public final boolean c(Object obj, InterfaceC5529nX1 interfaceC5529nX1) {
        this.d.post(new RunnableC6836tk0(1, this.e, this.g));
        return true;
    }

    @Override // defpackage.InterfaceC1088Gs1
    public final boolean g(final C2160Ul0 c2160Ul0, InterfaceC5529nX1 interfaceC5529nX1) {
        final C2424Xl0 c2424Xl0 = this.i;
        final ImageView imageView = this.e;
        final String str = this.g;
        final int i = this.h;
        this.d.post(new Runnable(imageView, str, i, c2424Xl0, c2160Ul0) { // from class: am0
            public final /* synthetic */ ImageView d;
            public final /* synthetic */ String e;
            public final /* synthetic */ int g;

            @Override // java.lang.Runnable
            public final void run() {
                C3435dm0.j(this.d, this.e, this.g);
                Unit unit = Unit.a;
            }
        });
        return true;
    }
}
