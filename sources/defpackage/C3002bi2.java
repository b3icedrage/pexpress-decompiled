package defpackage;

import android.webkit.ValueCallback;

/* JADX INFO: renamed from: bi2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3002bi2<T> implements ValueCallback {
    public final /* synthetic */ C3525eC1 a;

    public C3002bi2(C3525eC1 c3525eC1) {
        this.a = c3525eC1;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        C1717Ot1.a aVar = C1717Ot1.e;
        this.a.resumeWith((String) obj);
    }
}
