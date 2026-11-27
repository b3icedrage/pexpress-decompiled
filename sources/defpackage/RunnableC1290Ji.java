package defpackage;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.c;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC1290Ji implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC1290Ji(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ViewTreeObserverOnGlobalLayoutListenerC1368Ki.m9waitUntilActivityReady$lambda0((C7659xf2) this.e);
                return;
            case 1:
                C0672Bk this$0 = (C0672Bk) this.e;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ((W92) this$0.b.get()).a();
                InterfaceC7170vL interfaceC7170vL = this$0.d;
                interfaceC7170vL.F(null);
                interfaceC7170vL.M(null);
                return;
            case 2:
                AK1 ak1 = (AK1) this.e;
                synchronized (ak1.d) {
                    SharedPreferences.Editor editorEdit = ak1.a.edit();
                    String str = ak1.b;
                    StringBuilder sb = new StringBuilder();
                    Iterator<String> it = ak1.d.iterator();
                    while (it.hasNext()) {
                        sb.append(it.next());
                        sb.append(ak1.c);
                    }
                    editorEdit.putString(str, sb.toString()).commit();
                    break;
                }
                return;
            default:
                AFLogger.unregisterClient((c) this.e);
                return;
        }
    }
}
