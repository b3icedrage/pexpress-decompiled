package androidx.fragment.app;

import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final ArrayList<Fragment> a = new ArrayList<>();
    public final HashMap<String, o> b = new HashMap<>();
    public final HashMap<String, Bundle> c = new HashMap<>();
    public m d;

    public final void a(@NonNull Fragment fragment) {
        if (this.a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.a) {
            this.a.add(fragment);
        }
        fragment.mAdded = true;
    }

    public final Fragment b(@NonNull String str) {
        o oVar = this.b.get(str);
        if (oVar != null) {
            return oVar.c;
        }
        return null;
    }

    public final Fragment c(@NonNull String str) {
        Fragment fragmentFindFragmentByWho;
        for (o oVar : this.b.values()) {
            if (oVar != null && (fragmentFindFragmentByWho = oVar.c.findFragmentByWho(str)) != null) {
                return fragmentFindFragmentByWho;
            }
        }
        return null;
    }

    @NonNull
    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (o oVar : this.b.values()) {
            if (oVar != null) {
                arrayList.add(oVar);
            }
        }
        return arrayList;
    }

    @NonNull
    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (o oVar : this.b.values()) {
            if (oVar != null) {
                arrayList.add(oVar.c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    @NonNull
    public final List<Fragment> f() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public final void g(@NonNull o oVar) {
        Fragment fragment = oVar.c;
        String str = fragment.mWho;
        HashMap<String, o> map = this.b;
        if (map.get(str) != null) {
            return;
        }
        map.put(fragment.mWho, oVar);
        if (fragment.mRetainInstanceChangedWhileDetached) {
            if (fragment.mRetainInstance) {
                this.d.j(fragment);
            } else {
                this.d.l(fragment);
            }
            fragment.mRetainInstanceChangedWhileDetached = false;
        }
        if (FragmentManager.G(2)) {
            fragment.toString();
        }
    }

    public final void h(@NonNull o oVar) {
        Fragment fragment = oVar.c;
        if (fragment.mRetainInstance) {
            this.d.l(fragment);
        }
        HashMap<String, o> map = this.b;
        if (map.get(fragment.mWho) == oVar && map.put(fragment.mWho, null) != null && FragmentManager.G(2)) {
            fragment.toString();
        }
    }

    public final Bundle i(@NonNull String str, Bundle bundle) {
        HashMap<String, Bundle> map = this.c;
        return bundle != null ? map.put(str, bundle) : map.remove(str);
    }
}
