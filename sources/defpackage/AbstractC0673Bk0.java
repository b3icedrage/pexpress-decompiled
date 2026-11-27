package defpackage;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Bk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0673Bk0 extends H0 implements Serializable {

    /* JADX INFO: renamed from: Bk0$a */
    public static abstract class a<MessageType extends AbstractC0673Bk0, BuilderType extends a> extends H0.a<BuilderType> {
        public AbstractC1724Ow d = AbstractC1724Ow.d;

        @Override // 
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public abstract BuilderType k(MessageType messagetype);
    }

    /* JADX INFO: renamed from: Bk0$b */
    public static abstract class b<MessageType extends c<MessageType>, BuilderType extends b<MessageType, BuilderType>> extends a<MessageType, BuilderType> implements KZ0 {
        public C0727Cc0<d> e = C0727Cc0.d;
        public boolean g;

        public final void l(MessageType messagetype) {
            ZM1 zm1;
            if (!this.g) {
                this.e = this.e.clone();
                this.g = true;
            }
            C0727Cc0<d> c0727Cc0 = this.e;
            C0727Cc0<d> c0727Cc1 = messagetype.d;
            c0727Cc0.getClass();
            int i = 0;
            while (true) {
                int size = c0727Cc1.a.e.size();
                zm1 = c0727Cc1.a;
                if (i >= size) {
                    break;
                }
                c0727Cc0.h(zm1.e.get(i));
                i++;
            }
            Iterator<Map.Entry<Object, Object>> it = zm1.d().iterator();
            while (it.hasNext()) {
                c0727Cc0.h((Map.Entry) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: Bk0$d */
    public static final class d implements C0727Cc0.a<d> {
        public final int d;
        public final EnumC7254vj2 e;
        public final boolean g;

        public d(int i, EnumC7254vj2 enumC7254vj2, boolean z) {
            this.d = i;
            this.e = enumC7254vj2;
            this.g = z;
        }

        @Override // defpackage.C0727Cc0.a
        public final EnumC7675xj2 a() {
            return this.e.d;
        }

        @Override // defpackage.C0727Cc0.a
        public final boolean c() {
            return this.g;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            return this.d - ((d) obj).d;
        }

        @Override // defpackage.C0727Cc0.a
        public final EnumC7254vj2 g() {
            return this.e;
        }

        @Override // defpackage.C0727Cc0.a
        public final int getNumber() {
            return this.d;
        }

        @Override // defpackage.C0727Cc0.a
        public final a h(HZ0.a aVar, HZ0 hz0) {
            return ((a) aVar).k((AbstractC0673Bk0) hz0);
        }

        @Override // defpackage.C0727Cc0.a
        public final boolean j() {
            return false;
        }
    }

    /* JADX INFO: renamed from: Bk0$e */
    public static class e<ContainingType extends HZ0, Type> {
        public final c a;
        public final Type b;
        public final AbstractC0673Bk0 c;
        public final d d;
        public final Method e;

        /* JADX WARN: Multi-variable type inference failed */
        public e(c cVar, Object obj, AbstractC0673Bk0 abstractC0673Bk0, d dVar, Class cls) {
            if (cVar == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (dVar.e == EnumC7254vj2.j && abstractC0673Bk0 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.a = cVar;
            this.b = obj;
            this.c = abstractC0673Bk0;
            this.d = dVar;
            if (!YB0.a.class.isAssignableFrom(cls)) {
                this.e = null;
                return;
            }
            try {
                this.e = cls.getMethod("valueOf", Integer.TYPE);
            } catch (NoSuchMethodException e) {
                String name = cls.getName();
                StringBuilder sb = new StringBuilder(name.length() + 52);
                sb.append("Generated message class \"");
                sb.append(name);
                sb.append("\" missing method \"valueOf\".");
                throw new RuntimeException(sb.toString(), e);
            }
        }

        public final Object a(Object obj) {
            if (this.d.e.d != EnumC7675xj2.ENUM) {
                return obj;
            }
            try {
                return this.e.invoke(null, (Integer) obj);
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
            } catch (InvocationTargetException e2) {
                Throwable cause = e2.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }

        public final Object b(Object obj) {
            return this.d.e.d == EnumC7675xj2.ENUM ? Integer.valueOf(((YB0.a) obj).getNumber()) : obj;
        }
    }

    public static e c(c cVar, AbstractC0673Bk0 abstractC0673Bk0, int i, EnumC7254vj2.c cVar2, Class cls) {
        return new e(cVar, Collections.EMPTY_LIST, abstractC0673Bk0, new d(i, cVar2, true), cls);
    }

    public static e f(c cVar, Serializable serializable, AbstractC0673Bk0 abstractC0673Bk0, int i, EnumC7254vj2 enumC7254vj2, Class cls) {
        return new e(cVar, serializable, abstractC0673Bk0, new d(i, enumC7254vj2, false), cls);
    }

    /* JADX INFO: renamed from: Bk0$c */
    public static abstract class c<MessageType extends c<MessageType>> extends AbstractC0673Bk0 implements KZ0 {
        public final C0727Cc0<d> d;

        /* JADX INFO: renamed from: Bk0$c$a */
        public class a {
            public final Iterator<Map.Entry<d, Object>> a;
            public Map.Entry<d, Object> b;

            public a(c cVar) {
                Iterator<Map.Entry<d, Object>> it;
                C0727Cc0<d> c0727Cc0 = cVar.d;
                boolean z = c0727Cc0.c;
                ZM1 zm1 = c0727Cc0.a;
                if (z) {
                    Iterator<Map.Entry<K, Object>> it2 = ((C3349dN1.d) zm1.entrySet()).iterator();
                    C5291mO0.b bVar = new C5291mO0.b();
                    bVar.d = it2;
                    it = bVar;
                } else {
                    it = ((C3349dN1.d) zm1.entrySet()).iterator();
                }
                this.a = it;
                if (it.hasNext()) {
                    this.b = it.next();
                }
            }

            public final void a(int i, IE ie) {
                while (true) {
                    Map.Entry<d, Object> entry = this.b;
                    if (entry == null || entry.getKey().d >= i) {
                        return;
                    }
                    d key = this.b.getKey();
                    Object value = this.b.getValue();
                    C0727Cc0 c0727Cc0 = C0727Cc0.d;
                    EnumC7254vj2 enumC7254vj2 = key.e;
                    int i2 = key.d;
                    if (key.g) {
                        Iterator it = ((List) value).iterator();
                        while (it.hasNext()) {
                            C0727Cc0.l(ie, enumC7254vj2, i2, it.next());
                        }
                    } else if (value instanceof C5291mO0) {
                        C0727Cc0.l(ie, enumC7254vj2, i2, ((C5291mO0) value).a());
                    } else {
                        C0727Cc0.l(ie, enumC7254vj2, i2, value);
                    }
                    Iterator<Map.Entry<d, Object>> it2 = this.a;
                    if (it2.hasNext()) {
                        this.b = it2.next();
                    } else {
                        this.b = null;
                    }
                }
            }
        }

        public c() {
            this.d = new C0727Cc0<>();
        }

        public final boolean i() {
            int i = 0;
            while (true) {
                ZM1 zm1 = this.d.a;
                if (i >= zm1.e.size()) {
                    Iterator<Map.Entry<Object, Object>> it = zm1.d().iterator();
                    while (it.hasNext()) {
                        if (!C0727Cc0.f(it.next())) {
                            break;
                        }
                    }
                    return true;
                }
                if (!C0727Cc0.f(zm1.e.get(i))) {
                    break;
                }
                i++;
            }
            return false;
        }

        public final int j() {
            ZM1 zm1;
            int i = 0;
            int iD = 0;
            while (true) {
                zm1 = this.d.a;
                if (i >= zm1.e.size()) {
                    break;
                }
                C3349dN1<K, V>.b bVar = zm1.e.get(i);
                iD += C0727Cc0.d((C0727Cc0.a) bVar.getKey(), bVar.getValue());
                i++;
            }
            for (Map.Entry<Object, Object> entry : zm1.d()) {
                iD += C0727Cc0.d((C0727Cc0.a) entry.getKey(), entry.getValue());
            }
            return iD;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v3, types: [Type, java.util.ArrayList] */
        public final <Type> Type k(e<MessageType, Type> eVar) {
            o(eVar);
            C0727Cc0<d> c0727Cc0 = this.d;
            d dVar = eVar.d;
            Type type = (Type) c0727Cc0.e(dVar);
            if (type == null) {
                return eVar.b;
            }
            if (!dVar.g) {
                return (Type) eVar.a(type);
            }
            if (dVar.e.d != EnumC7675xj2.ENUM) {
                return type;
            }
            ?? r1 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r1.add(eVar.a(it.next()));
            }
            return r1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean l(e<MessageType, Type> eVar) {
            o(eVar);
            C0727Cc0<d> c0727Cc0 = this.d;
            c0727Cc0.getClass();
            d dVar = eVar.d;
            if (dVar.g) {
                throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
            }
            return c0727Cc0.a.get(dVar) != null;
        }

        public final void m() {
            this.d.g();
        }

        /* JADX WARN: Code duplicated, block: B:4:0x001d  */
        public final boolean n(EE ee, IE ie, C1578Na0 c1578Na0, int i) throws C7144vC0 {
            boolean z;
            boolean z2;
            Object objBuild;
            HZ0 hz0;
            HZ0 hz0E = e();
            int i2 = i & 7;
            c1578Na0.getClass();
            e<?, ?> eVar = c1578Na0.a.get(new C1578Na0.a(i >>> 3, hz0E));
            if (eVar == null) {
                z2 = false;
                z = true;
            } else {
                d dVar = eVar.d;
                EnumC7254vj2 enumC7254vj2 = dVar.e;
                C0727Cc0 c0727Cc0 = C0727Cc0.d;
                if (i2 == enumC7254vj2.e) {
                    z = false;
                    z2 = false;
                } else if (dVar.g && enumC7254vj2.b() && i2 == 2) {
                    z = false;
                    z2 = true;
                } else {
                    z2 = false;
                    z = true;
                }
            }
            if (z) {
                return ee.q(i, ie);
            }
            HZ0.a aVarG = null;
            C0727Cc0<d> c0727Cc1 = this.d;
            if (z2) {
                int iD = ee.d(ee.k());
                d dVar2 = eVar.d;
                if (dVar2.e != EnumC7254vj2.k) {
                    while (ee.b() > 0) {
                        c0727Cc1.a(dVar2, C0727Cc0.i(ee, dVar2.e));
                    }
                } else if (ee.b() > 0) {
                    ee.k();
                    throw null;
                }
                ee.c(iD);
                return true;
            }
            int iOrdinal = eVar.d.e.d.ordinal();
            d dVar3 = eVar.d;
            if (iOrdinal == 7) {
                ee.k();
                dVar3.getClass();
                throw null;
            }
            if (iOrdinal != 8) {
                objBuild = C0727Cc0.i(ee, dVar3.e);
            } else {
                if (!dVar3.g && (hz0 = (HZ0) c0727Cc1.e(dVar3)) != null) {
                    aVarG = hz0.b();
                }
                if (aVarG == null) {
                    aVarG = eVar.c.g();
                }
                if (dVar3.e == EnumC7254vj2.i) {
                    int i3 = ee.i;
                    if (i3 >= 64) {
                        throw new C7144vC0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
                    ee.i = i3 + 1;
                    aVarG.U0(ee, c1578Na0);
                    ee.a((dVar3.d << 3) | 4);
                    ee.i--;
                } else {
                    int iK = ee.k();
                    if (ee.i >= 64) {
                        throw new C7144vC0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
                    }
                    int iD2 = ee.d(iK);
                    ee.i++;
                    aVarG.U0(ee, c1578Na0);
                    ee.a(0);
                    ee.i--;
                    ee.c(iD2);
                }
                objBuild = aVarG.build();
            }
            if (dVar3.g) {
                c0727Cc1.a(dVar3, eVar.b(objBuild));
                return true;
            }
            c0727Cc1.j(dVar3, eVar.b(objBuild));
            return true;
        }

        public final void o(e<MessageType, ?> eVar) {
            if (eVar.a != e()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public c(b<MessageType, ?> bVar) {
            bVar.e.g();
            bVar.g = false;
            this.d = bVar.e;
        }
    }
}
