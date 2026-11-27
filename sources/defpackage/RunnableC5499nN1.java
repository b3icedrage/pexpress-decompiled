package defpackage;

import com.appsflyer.internal.AFa1tSDK;

/* JADX INFO: renamed from: nN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC5499nN1 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC5499nN1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ((AbstractC5709oN1) this.e).e = true;
                break;
            default:
                ((AFa1tSDK) this.e).unregisterClient();
                break;
        }
    }
}
