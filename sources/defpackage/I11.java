package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class I11<Model, Data> implements I01<Model, Data> {
    public final ArrayList a;
    public final C5751ob0.c b;

    public static class a<Data> implements InterfaceC6771tS<Data>, InterfaceC6771tS.a<Data> {
        public final ArrayList d;
        public final C5751ob0.c e;
        public int g;
        public EnumC7035uh1 h;
        public InterfaceC6771tS.a<? super Data> i;
        public List<Throwable> j;
        public boolean k;

        public a(@NonNull ArrayList arrayList, @NonNull C5751ob0.c cVar) {
            this.e = cVar;
            if (arrayList.isEmpty()) {
                throw new IllegalArgumentException("Must not be empty.");
            }
            this.d = arrayList;
            this.g = 0;
        }

        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final Class<Data> a() {
            return ((InterfaceC6771tS) this.d.get(0)).a();
        }

        @Override // defpackage.InterfaceC6771tS
        public final void b() {
            List<Throwable> list = this.j;
            if (list != null) {
                this.e.b(list);
            }
            this.j = null;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((InterfaceC6771tS) it.next()).b();
            }
        }

        @Override // defpackage.InterfaceC6771tS
        public final void c(@NonNull EnumC7035uh1 enumC7035uh1, @NonNull InterfaceC6771tS.a<? super Data> aVar) {
            this.h = enumC7035uh1;
            this.i = aVar;
            this.j = (List) this.e.a();
            ((InterfaceC6771tS) this.d.get(this.g)).c(enumC7035uh1, this);
            if (this.k) {
                cancel();
            }
        }

        @Override // defpackage.InterfaceC6771tS
        public final void cancel() {
            this.k = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((InterfaceC6771tS) it.next()).cancel();
            }
        }

        @Override // defpackage.InterfaceC6771tS.a
        public final void d(@NonNull Exception exc) {
            List<Throwable> list = this.j;
            UE.e(list, "Argument must not be null");
            list.add(exc);
            g();
        }

        @Override // defpackage.InterfaceC6771tS
        @NonNull
        public final CS e() {
            return ((InterfaceC6771tS) this.d.get(0)).e();
        }

        @Override // defpackage.InterfaceC6771tS.a
        public final void f(Data data) {
            if (data != null) {
                this.i.f(data);
            } else {
                g();
            }
        }

        public final void g() {
            if (this.k) {
                return;
            }
            if (this.g < this.d.size() - 1) {
                this.g++;
                c(this.h, this.i);
            } else {
                UE.d(this.j);
                this.i.d(new C2160Ul0("Fetch failed", new ArrayList(this.j)));
            }
        }
    }

    public I11(@NonNull ArrayList arrayList, @NonNull C5751ob0.c cVar) {
        this.a = arrayList;
        this.b = cVar;
    }

    @Override // defpackage.I01
    public final boolean a(@NonNull Model model) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((I01) it.next()).a(model)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.I01
    public final I01.a<Data> b(@NonNull Model model, int i, int i2, @NonNull C4227ha1 c4227ha1) {
        I01.a<Data> aVarB;
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        InterfaceC3129cK0 interfaceC3129cK0 = null;
        for (int i3 = 0; i3 < size; i3++) {
            I01 i01 = (I01) arrayList.get(i3);
            if (i01.a(model) && (aVarB = i01.b(model, i, i2, c4227ha1)) != null) {
                arrayList2.add(aVarB.c);
                interfaceC3129cK0 = aVarB.a;
            }
        }
        if (arrayList2.isEmpty() || interfaceC3129cK0 == null) {
            return null;
        }
        return new I01.a<>(interfaceC3129cK0, new a(arrayList2, this.b));
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + '}';
    }
}
