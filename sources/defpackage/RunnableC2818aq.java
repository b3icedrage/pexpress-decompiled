package defpackage;

import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.Fragment;
import com.appsflyer.AFLogger;
import com.appsflyer.a;

/* JADX INFO: renamed from: aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2818aq implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ RunnableC2818aq(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case 0:
                ViewOnTouchListenerC3656eq viewOnTouchListenerC3656eq = (ViewOnTouchListenerC3656eq) this.e;
                ViewParent parent = viewOnTouchListenerC3656eq.getParent();
                if (parent != null) {
                    viewOnTouchListenerC3656eq.clearAnimation();
                    ((ViewGroup) parent).removeView(viewOnTouchListenerC3656eq);
                }
                break;
            case 1:
                ((Fragment) this.e).lambda$performCreateView$0();
                break;
            default:
                AFLogger.unregisterClient((a) this.e);
                break;
        }
    }
}
