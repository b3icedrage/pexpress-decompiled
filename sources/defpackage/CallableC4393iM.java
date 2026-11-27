package defpackage;

import com.appsflyer.sdk_base.util.ContentProviderFetcher;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: iM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC4393iM implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ CallableC4393iM(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.d) {
            case 0:
                return ((ContentProviderFetcher) this.e).lambda$new$0();
            default:
                return Integer.valueOf(((CG1.a) this.e).a().length);
        }
    }
}
