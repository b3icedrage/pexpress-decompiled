package androidx.fragment.app;

import androidx.annotation.NonNull;
import androidx.lifecycle.x;
import defpackage.Qd2;
import defpackage.Vd2;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class m extends Qd2 {
    public static final a j = new a();
    public final boolean g;
    public final HashMap<String, Fragment> d = new HashMap<>();
    public final HashMap<String, m> e = new HashMap<>();
    public final HashMap<String, Vd2> f = new HashMap<>();
    public boolean h = false;
    public boolean i = false;

    public class a implements x.b {
        @Override // androidx.lifecycle.x.b
        @NonNull
        public final <T extends Qd2> T a(@NonNull Class<T> cls) {
            return new m(true);
        }
    }

    public m(boolean z) {
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.d.equals(mVar.d) && this.e.equals(mVar.e) && this.f.equals(mVar.f)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.Qd2
    public final void h() {
        if (FragmentManager.G(3)) {
            toString();
        }
        this.h = true;
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + (this.d.hashCode() * 31)) * 31);
    }

    public final void j(@NonNull Fragment fragment) {
        if (this.i) {
            FragmentManager.G(2);
            return;
        }
        HashMap<String, Fragment> map = this.d;
        if (map.containsKey(fragment.mWho)) {
            return;
        }
        map.put(fragment.mWho, fragment);
        if (FragmentManager.G(2)) {
            fragment.toString();
        }
    }

    public final void k(@NonNull String str) {
        HashMap<String, m> map = this.e;
        m mVar = map.get(str);
        if (mVar != null) {
            mVar.h();
            map.remove(str);
        }
        HashMap<String, Vd2> map2 = this.f;
        Vd2 vd2 = map2.get(str);
        if (vd2 != null) {
            vd2.a();
            map2.remove(str);
        }
    }

    public final void l(@NonNull Fragment fragment) {
        if (this.i) {
            FragmentManager.G(2);
        } else {
            if (this.d.remove(fragment.mWho) == null || !FragmentManager.G(2)) {
                return;
            }
            fragment.toString();
        }
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.d.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.e.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
