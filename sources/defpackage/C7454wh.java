package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: wh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7454wh {
    public static volatile C7454wh d;
    public static final Object e = new Object();

    @NonNull
    public final Context c;

    @NonNull
    public final HashSet b = new HashSet();

    @NonNull
    public final HashMap a = new HashMap();

    public C7454wh(@NonNull Context context) {
        this.c = context.getApplicationContext();
    }

    @NonNull
    public static C7454wh c(@NonNull Context context) {
        if (d == null) {
            synchronized (e) {
                try {
                    if (d == null) {
                        d = new C7454wh(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC5879pA0.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new C7815yP1(e2);
            }
        }
    }

    @NonNull
    public final Object b(@NonNull Class cls, @NonNull HashSet hashSet) {
        Object objB;
        if (F02.a()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.a;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC5879pA0 interfaceC5879pA0 = (InterfaceC5879pA0) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends InterfaceC5879pA0<?>>> listA = interfaceC5879pA0.a();
                if (!listA.isEmpty()) {
                    for (Class<? extends InterfaceC5879pA0<?>> cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = interfaceC5879pA0.b(this.c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new C7815yP1(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}
