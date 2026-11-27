package defpackage;

import android.app.Activity;
import android.database.SQLException;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.sentry.android.core.C4494e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MK implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ MK(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                List listenersList = (List) this.e;
                Intrinsics.checkNotNullParameter(listenersList, "$listenersList");
                NK this$0 = (NK) this.g;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Iterator it = listenersList.iterator();
                while (it.hasNext()) {
                    ((LK) it.next()).a(this$0.e);
                }
                return;
            case 1:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.g;
                try {
                    taskCompletionSource.setResult(((C4983kw0) this.e).c());
                    return;
                } catch (Exception e) {
                    taskCompletionSource.setException(e);
                    return;
                }
            case 2:
                C3036bs1 c3036bs1 = (C3036bs1) this.e;
                c3036bs1.getClass();
                try {
                    T42<AbstractC5713oP> t42 = c3036bs1.g;
                    EnumC6825th1 enumC6825th1 = EnumC6825th1.g;
                    if (!(t42 instanceof Y42)) {
                        throw new IllegalArgumentException("Expected instance of TransportImpl.");
                    }
                    C3081c52.a().d.a(((Y42) t42).a.d(enumC6825th1), 1);
                    ((CountDownLatch) this.g).countDown();
                    return;
                } catch (SQLException unused) {
                }
                break;
            default:
                ((C4494e) this.e).a.a().b((Activity) this.g);
                return;
        }
    }
}
