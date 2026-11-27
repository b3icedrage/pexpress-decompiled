package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.manager.b;
import io.sentry.android.core.b0;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: Is1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FragmentC1244Is1 extends Fragment {
    public final Z6 d;
    public final a e;
    public final HashSet g;
    public ComponentCallbacks2C1166Hs1 h;
    public FragmentC1244Is1 i;
    public Fragment j;

    /* JADX INFO: renamed from: Is1$a */
    public class a implements InterfaceC1322Js1 {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + FragmentC1244Is1.this + "}";
        }
    }

    public FragmentC1244Is1() {
        Z6 z6 = new Z6();
        this.e = new a();
        this.g = new HashSet();
        this.d = z6;
    }

    public final void a(@NonNull Activity activity) {
        FragmentC1244Is1 fragmentC1244Is1 = this.i;
        if (fragmentC1244Is1 != null) {
            fragmentC1244Is1.g.remove(this);
            this.i = null;
        }
        b bVar = com.bumptech.glide.a.a(activity).i;
        bVar.getClass();
        FragmentC1244Is1 fragmentC1244Is1G = bVar.g(activity.getFragmentManager(), null);
        this.i = fragmentC1244Is1G;
        if (equals(fragmentC1244Is1G)) {
            return;
        }
        this.i.g.add(this);
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                b0.f("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.d.b();
        FragmentC1244Is1 fragmentC1244Is1 = this.i;
        if (fragmentC1244Is1 != null) {
            fragmentC1244Is1.g.remove(this);
            this.i = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        FragmentC1244Is1 fragmentC1244Is1 = this.i;
        if (fragmentC1244Is1 != null) {
            fragmentC1244Is1.g.remove(this);
            this.i = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        Z6 z6 = this.d;
        z6.e = true;
        Iterator it = C6177qc2.e(z6.d).iterator();
        while (it.hasNext()) {
            ((DP0) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        Z6 z6 = this.d;
        z6.e = false;
        Iterator it = C6177qc2.e(z6.d).iterator();
        while (it.hasNext()) {
            ((DP0) it.next()).onStop();
        }
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.j;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }
}
