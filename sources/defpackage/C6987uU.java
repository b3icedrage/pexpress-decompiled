package defpackage;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.data.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: uU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6987uU<DataType, ResourceType, Transcode> {
    public final Class<DataType> a;
    public final List<? extends InterfaceC4765jt1<DataType, ResourceType>> b;
    public final InterfaceC6867tt1<ResourceType, Transcode> c;
    public final C5751ob0.c d;
    public final String e;

    public C6987uU(Class cls, Class cls2, Class cls3, List list, InterfaceC6867tt1 interfaceC6867tt1, C5751ob0.c cVar) {
        this.a = cls;
        this.b = list;
        this.c = interfaceC6867tt1;
        this.d = cVar;
        this.e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final InterfaceC3667et1 a(int i, int i2, RunnableC6777tU.a aVar, @NonNull C4227ha1 c4227ha1, a aVar2) {
        InterfaceC3667et1 interfaceC3667et1A;
        InterfaceC6486s42 interfaceC6486s42;
        A60 a60D;
        boolean z;
        boolean z2;
        InterfaceC3129cK0 c5722oS;
        C5751ob0.c cVar = this.d;
        List<Throwable> list = (List) cVar.a();
        try {
            InterfaceC3667et1<ResourceType> interfaceC3667et1B = b(aVar2, i, i2, c4227ha1, list);
            cVar.b(list);
            RunnableC6777tU runnableC6777tU = RunnableC6777tU.this;
            runnableC6777tU.getClass();
            Class<?> cls = interfaceC3667et1B.get().getClass();
            CS cs = CS.h;
            CS cs2 = aVar.a;
            C6567sU<R> c6567sU = runnableC6777tU.d;
            InterfaceC5398mt1 interfaceC5398mt1A = null;
            if (cs2 != cs) {
                InterfaceC6486s42 interfaceC6486s42E = c6567sU.e((Class<Z>) cls);
                interfaceC6486s42 = interfaceC6486s42E;
                interfaceC3667et1A = interfaceC6486s42E.a(runnableC6777tU.l, interfaceC3667et1B, runnableC6777tU.p, runnableC6777tU.q);
            } else {
                interfaceC3667et1A = interfaceC3667et1B;
                interfaceC6486s42 = null;
            }
            if (!interfaceC3667et1B.equals(interfaceC3667et1A)) {
                interfaceC3667et1B.b();
            }
            if (c6567sU.c.a().d.a(interfaceC3667et1A.d()) != null) {
                C2596Zq1 c2596Zq1A = c6567sU.c.a();
                c2596Zq1A.getClass();
                interfaceC5398mt1A = c2596Zq1A.d.a(interfaceC3667et1A.d());
                if (interfaceC5398mt1A == null) {
                    throw new C2596Zq1.d(interfaceC3667et1A.d());
                }
                a60D = interfaceC5398mt1A.d(runnableC6777tU.s);
            } else {
                a60D = A60.g;
            }
            InterfaceC5398mt1 interfaceC5398mt1 = interfaceC5398mt1A;
            InterfaceC3129cK0 interfaceC3129cK0 = runnableC6777tU.A;
            ArrayList arrayListB = c6567sU.b();
            int size = arrayListB.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    z = false;
                    break;
                }
                if (((I01.a) arrayListB.get(i3)).a.equals(interfaceC3129cK0)) {
                    z = true;
                    break;
                }
                i3++;
            }
            Object obj = interfaceC3667et1A;
            if (runnableC6777tU.r.d(!z, cs2, a60D)) {
                if (interfaceC5398mt1 == null) {
                    throw new C2596Zq1.d(interfaceC3667et1A.get().getClass());
                }
                int iOrdinal = a60D.ordinal();
                if (iOrdinal == 0) {
                    z2 = true;
                    c5722oS = new C5722oS(runnableC6777tU.A, runnableC6777tU.m);
                } else {
                    if (iOrdinal != 1) {
                        throw new IllegalArgumentException("Unknown strategy: " + a60D);
                    }
                    z2 = true;
                    c5722oS = new C4297ht1(c6567sU.c.a, runnableC6777tU.A, runnableC6777tU.m, runnableC6777tU.p, runnableC6777tU.q, interfaceC6486s42, cls, runnableC6777tU.s);
                }
                C4670jS0<Z> c4670jS0 = (C4670jS0) C4670jS0.i.a();
                c4670jS0.h = false;
                c4670jS0.g = z2;
                c4670jS0.e = interfaceC3667et1A;
                RunnableC6777tU.b<?> bVar = runnableC6777tU.j;
                bVar.a = c5722oS;
                bVar.b = interfaceC5398mt1;
                bVar.c = c4670jS0;
                obj = c4670jS0;
            }
            return this.c.a(obj, c4227ha1);
        } catch (Throwable th) {
            cVar.b(list);
            throw th;
        }
    }

    @NonNull
    public final InterfaceC3667et1<ResourceType> b(a<DataType> aVar, int i, int i2, @NonNull C4227ha1 c4227ha1, List<Throwable> list) throws C2160Ul0 {
        List<? extends InterfaceC4765jt1<DataType, ResourceType>> list2 = this.b;
        int size = list2.size();
        InterfaceC3667et1<ResourceType> interfaceC3667et1A = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC4765jt1<DataType, ResourceType> interfaceC4765jt1 = list2.get(i3);
            try {
                if (interfaceC4765jt1.b(aVar.a(), c4227ha1)) {
                    interfaceC3667et1A = interfaceC4765jt1.a(aVar.a(), i, i2, c4227ha1);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(interfaceC4765jt1);
                }
                list.add(e);
            }
            if (interfaceC3667et1A != null) {
                break;
            }
        }
        if (interfaceC3667et1A != null) {
            return interfaceC3667et1A;
        }
        throw new C2160Ul0(this.e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.a + ", decoders=" + this.b + ", transcoder=" + this.c + '}';
    }
}
