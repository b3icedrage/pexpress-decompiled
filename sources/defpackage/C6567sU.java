package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: sU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6567sU<Transcode> {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public C2082Tl0 c;
    public Object d;
    public int e;
    public int f;
    public Class<?> g;
    public Q60.c h;
    public C4227ha1 i;
    public C6667sx j;
    public Class<Transcode> k;
    public boolean l;
    public boolean m;
    public InterfaceC3129cK0 n;
    public EnumC7035uh1 o;
    public AbstractC2634a20 p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                I01.a aVar = (I01.a) arrayListB.get(i);
                if (!arrayList.contains(aVar.a)) {
                    arrayList.add(aVar.a);
                }
                int i2 = 0;
                while (true) {
                    List<InterfaceC3129cK0> list = aVar.b;
                    if (i2 < list.size()) {
                        if (!arrayList.contains(list.get(i2))) {
                            arrayList.add(list.get(i2));
                        }
                        i2++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List listF = this.c.a().f(this.d);
            int size = listF.size();
            for (int i = 0; i < size; i++) {
                I01.a aVarB = ((I01) listF.get(i)).b(this.d, this.e, this.f, this.i);
                if (aVarB != null) {
                    arrayList.add(aVarB);
                }
            }
        }
        return arrayList;
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
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r3v16 pR0<?, ?, ?>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final <Data> defpackage.C5930pR0<Data, ?, Transcode> c(java.lang.Class<Data> r18) {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6567sU.c(java.lang.Class):pR0");
    }

    public final <X> E60<X> d(X x) {
        E60<X> e60;
        G60 g60 = this.c.a().b;
        Class<?> cls = x.getClass();
        synchronized (g60) {
            Iterator it = g60.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    e60 = null;
                    break;
                }
                G60.a aVar = (G60.a) it.next();
                if (aVar.a.isAssignableFrom(cls)) {
                    e60 = (E60<X>) aVar.b;
                    break;
                }
            }
        }
        if (e60 != null) {
            return e60;
        }
        throw new C2596Zq1.e("Failed to find source encoder for data class: " + x.getClass());
    }

    public final <Z> InterfaceC6486s42<Z> e(Class<Z> cls) {
        InterfaceC6486s42<Z> interfaceC6486s42 = (InterfaceC6486s42) this.j.getOrDefault(cls, null);
        if (interfaceC6486s42 == null) {
            for (Map.Entry entry : (AbstractC6155qW0.b) this.j.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    interfaceC6486s42 = (InterfaceC6486s42) entry.getValue();
                    break;
                }
            }
        }
        if (interfaceC6486s42 != null) {
            return interfaceC6486s42;
        }
        if (!this.j.isEmpty() || !this.q) {
            return K82.b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
