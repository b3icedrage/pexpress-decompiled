package defpackage;

import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: hJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4176hJ1<T> implements InterfaceC5331mb0<Set<T>> {
    public static final /* synthetic */ int c = 0;
    public final List<InterfaceC1454Lk1<T>> a;
    public final List<InterfaceC1454Lk1<Collection<T>>> b;

    /* JADX INFO: renamed from: hJ1$a */
    public static final class a<T> {
        public final List<InterfaceC1454Lk1<T>> a;
        public final List<InterfaceC1454Lk1<Collection<T>>> b;

        public a(int i) {
            this.a = i == 0 ? Collections.EMPTY_LIST : new ArrayList(i);
            this.b = Collections.EMPTY_LIST;
        }

        public final C4176hJ1<T> a() {
            return new C4176hJ1<>(this.a, this.b);
        }
    }

    static {
        C0957Fb.h(Collections.EMPTY_SET, "instance cannot be null");
    }

    public C4176hJ1(List list, List list2) {
        this.a = list;
        this.b = list2;
    }

    public static a a(int i) {
        return new a(i);
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        List<InterfaceC1454Lk1<T>> list = this.a;
        int size = list.size();
        List<InterfaceC1454Lk1<Collection<T>>> list2 = this.b;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i = 0; i < size2; i++) {
            Collection<T> collection = list2.get(i).get();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSet = new HashSet(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Api.BaseClientBuilder.API_PRIORITY_OTHER);
        int size3 = list.size();
        for (int i2 = 0; i2 < size3; i2++) {
            T t = list.get(i2).get();
            t.getClass();
            hashSet.add(t);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object obj : (Collection) arrayList.get(i3)) {
                obj.getClass();
                hashSet.add(obj);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }
}
