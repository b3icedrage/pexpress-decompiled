package defpackage;

import android.app.Activity;
import androidx.core.app.FrameMetricsAggregator;
import androidx.fragment.app.FragmentManager;
import com.impl.feature.registration.screens.forgetpassword.ForgetPasswordFragmentImpl;
import io.sentry.android.core.C4494e;
import io.sentry.android.core.performance.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: th0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class RunnableC6824th0 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC6824th0(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ForgetPasswordFragmentImpl forgetPasswordFragmentImpl = (ForgetPasswordFragmentImpl) this.e;
                Object obj = forgetPasswordFragmentImpl.i;
                Intrinsics.checkNotNull(obj);
                C0664Bh0 c0664Bh0 = (C0664Bh0) obj;
                FragmentManager fragmentManager = forgetPasswordFragmentImpl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(fragmentManager, "getChildFragmentManager(...)");
                int id = forgetPasswordFragmentImpl.k.a().getId();
                c0664Bh0.getClass();
                Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
                c0664Bh0.x.a(fragmentManager, id);
                return;
            case 1:
                KU0 ku0 = (KU0) this.e;
                JU0<T> ju0 = ku0.d;
                if (ju0 == 0) {
                    return;
                }
                Object obj2 = ju0.a;
                if (obj2 != null) {
                    synchronized (ku0) {
                        Iterator it = new ArrayList(ku0.a).iterator();
                        while (it.hasNext()) {
                            ((GU0) it.next()).a(obj2);
                        }
                    }
                    return;
                }
                Throwable th = ju0.b;
                synchronized (ku0) {
                    ArrayList arrayList = new ArrayList(ku0.b);
                    if (arrayList.isEmpty()) {
                        CS0.c("Lottie encountered an error but no failure listener was added:", th);
                        return;
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        ((GU0) it2.next()).a(th);
                    }
                    return;
                }
            case 2:
                C7040ui2.a aVar = (C7040ui2.a) this.e;
                if (aVar.b) {
                    return;
                }
                aVar.b = true;
                aVar.a.stopLoading();
                aVar.c.c.post(new RunnableC4408iR(aVar, 2));
                return;
            case 3:
                FrameMetricsAggregator.a aVar2 = ((C4494e) this.e).a.a().a;
                ArrayList<WeakReference<Activity>> arrayList2 = aVar2.c;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    WeakReference<Activity> weakReference = arrayList2.get(size);
                    Activity activity = weakReference.get();
                    if (weakReference.get() != null) {
                        activity.getWindow().removeOnFrameMetricsAvailableListener(aVar2.d);
                        arrayList2.remove(size);
                    }
                }
                return;
            default:
                ((h) this.e).g();
                return;
        }
    }
}
