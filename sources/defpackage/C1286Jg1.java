package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: Jg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1286Jg1 extends AbstractC8097zk0<C1286Jg1, a> implements LZ0 {
    private static final C1286Jg1 DEFAULT_INSTANCE;
    private static volatile InterfaceC6805tc1<C1286Jg1> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private VB0.c<String> strings_ = C0830Dk1.h;

    /* JADX INFO: renamed from: Jg1$a */
    public static final class a extends AbstractC8097zk0.a<C1286Jg1, a> implements LZ0 {
        public a() {
            super(C1286Jg1.DEFAULT_INSTANCE);
        }
    }

    static {
        C1286Jg1 c1286Jg1 = new C1286Jg1();
        DEFAULT_INSTANCE = c1286Jg1;
        AbstractC8097zk0.p(C1286Jg1.class, c1286Jg1);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void r(C1286Jg1 c1286Jg1, Set set) {
        VB0.c<String> cVar = c1286Jg1.strings_;
        if (!cVar.v()) {
            int size = cVar.size();
            c1286Jg1.strings_ = cVar.l(size == 0 ? 10 : size * 2);
        }
        List list = c1286Jg1.strings_;
        Charset charset = VB0.a;
        set.getClass();
        if (!(set instanceof InterfaceC3983gP0)) {
            if (set instanceof InterfaceC5776oh1) {
                list.addAll(set);
                return;
            }
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(set.size() + list.size());
            }
            int size2 = list.size();
            for (Object obj : set) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size2) + " is null.";
                    for (int size3 = list.size() - 1; size3 >= size2; size3--) {
                        list.remove(size3);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
            return;
        }
        List<?> listG = ((InterfaceC3983gP0) set).g();
        InterfaceC3983gP0 interfaceC3983gP0 = (InterfaceC3983gP0) list;
        int size4 = list.size();
        for (Object obj2 : listG) {
            if (obj2 == null) {
                String str2 = "Element at index " + (interfaceC3983gP0.size() - size4) + " is null.";
                for (int size5 = interfaceC3983gP0.size() - 1; size5 >= size4; size5--) {
                    interfaceC3983gP0.remove(size5);
                }
                throw new NullPointerException(str2);
            }
            if (obj2 instanceof AbstractC1565Mw) {
                interfaceC3983gP0.i0();
            } else if (obj2 instanceof byte[]) {
                byte[] bArr = (byte[]) obj2;
                AbstractC1565Mw.c(bArr, 0, bArr.length);
                interfaceC3983gP0.i0();
            } else {
                interfaceC3983gP0.add((String) obj2);
            }
        }
    }

    public static C1286Jg1 s() {
        return DEFAULT_INSTANCE;
    }

    public static a u() {
        return (a) ((AbstractC8097zk0.a) DEFAULT_INSTANCE.i(AbstractC8097zk0.f.i));
    }

    @Override // defpackage.AbstractC8097zk0
    public final Object i(AbstractC8097zk0.f fVar) {
        InterfaceC6805tc1 bVar;
        switch (fVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C2008Sm1(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new C1286Jg1();
            case 4:
                return new a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC6805tc1<C1286Jg1> interfaceC6805tc1 = PARSER;
                if (interfaceC6805tc1 != null) {
                    return interfaceC6805tc1;
                }
                synchronized (C1286Jg1.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC8097zk0.b();
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final VB0.c t() {
        return this.strings_;
    }
}
