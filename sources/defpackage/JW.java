package defpackage;

import com.appsflyer.internal.AFa1tSDK;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class JW implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ JW(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                KW.b((KW) this.e);
                break;
            case 1:
                ((ViewOnLongClickListenerC6260r02) this.e).a();
                break;
            default:
                ((AFa1tSDK) this.e).v();
                break;
        }
    }
}
