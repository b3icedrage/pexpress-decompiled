package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class T81 implements View.OnClickListener {
    public final a d;
    public final int e;

    public interface a {
        void b(int i);
    }

    public T81(a aVar, int i) {
        this.d = aVar;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.d.b(this.e);
    }
}
