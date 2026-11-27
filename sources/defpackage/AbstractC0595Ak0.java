package defpackage;

import defpackage.AbstractC0595Ak0;
import defpackage.AbstractC0595Ak0.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: Ak0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0595Ak0<MessageType extends AbstractC0595Ak0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends G0<MessageType, BuilderType> {
    private static Map<Object, AbstractC0595Ak0<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected O82 unknownFields = O82.e;
    protected int memoizedSerializedSize = -1;

    /* JADX INFO: renamed from: Ak0$a */
    public static abstract class a<MessageType extends AbstractC0595Ak0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends G0.a<MessageType, BuilderType> {
        public final MessageType d;
        public MessageType e;
        public boolean g = false;

        public a(MessageType messagetype) {
            this.d = messagetype;
            this.e = (MessageType) messagetype.q(e.h);
        }

        public static void r(AbstractC0595Ak0 abstractC0595Ak0, AbstractC0595Ak0 abstractC0595Ak1) {
            C0596Ak1 c0596Ak1 = C0596Ak1.c;
            c0596Ak1.getClass();
            c0596Ak1.a(abstractC0595Ak0.getClass()).d(abstractC0595Ak0, abstractC0595Ak1);
        }

        public final Object clone() {
            a aVar = (a) this.d.q(e.i);
            AbstractC0595Ak0 abstractC0595Ak0O = o();
            aVar.p();
            r(aVar.e, abstractC0595Ak0O);
            return aVar;
        }

        public final MessageType n() {
            MessageType messagetype = (MessageType) o();
            byte bByteValue = ((Byte) messagetype.q(e.d)).byteValue();
            boolean zC = true;
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zC = false;
                } else {
                    C0596Ak1 c0596Ak1 = C0596Ak1.c;
                    c0596Ak1.getClass();
                    zC = c0596Ak1.a(messagetype.getClass()).c(messagetype);
                    messagetype.q(e.e);
                }
            }
            if (zC) {
                return messagetype;
            }
            throw new B82("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        }

        public final MessageType o() {
            if (this.g) {
                return this.e;
            }
            MessageType messagetype = this.e;
            messagetype.getClass();
            C0596Ak1 c0596Ak1 = C0596Ak1.c;
            c0596Ak1.getClass();
            c0596Ak1.a(messagetype.getClass()).b(messagetype);
            this.g = true;
            return this.e;
        }

        public final void p() {
            if (this.g) {
                MessageType messagetype = (MessageType) this.e.q(e.h);
                r(messagetype, this.e);
                this.e = messagetype;
                this.g = false;
            }
        }
    }

    /* JADX INFO: renamed from: Ak0$b */
    public static class b<T extends AbstractC0595Ak0<T, ?>> extends P0<T> {
    }

    /* JADX INFO: renamed from: Ak0$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC0595Ak0<MessageType, BuilderType> implements JZ0 {
        protected C0649Bc0<d> extensions = C0649Bc0.d;

        @Override // defpackage.AbstractC0595Ak0, defpackage.GZ0
        public final a b() {
            a aVar = (a) q(e.i);
            aVar.p();
            a.r(aVar.e, this);
            return aVar;
        }

        @Override // defpackage.AbstractC0595Ak0, defpackage.JZ0
        public final AbstractC0595Ak0 d() {
            return (AbstractC0595Ak0) q(e.j);
        }
    }

    /* JADX INFO: renamed from: Ak0$d */
    public static final class d implements C0649Bc0.a<d> {
        @Override // defpackage.C0649Bc0.a
        public final EnumC7465wj2 a() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: Ak0$e */
    public static final class e {
        public static final e d;
        public static final e e;
        public static final e g;
        public static final e h;
        public static final e i;
        public static final e j;
        public static final /* synthetic */ e[] k;

        static {
            e eVar = new e("GET_MEMOIZED_IS_INITIALIZED", 0);
            d = eVar;
            e eVar2 = new e("SET_MEMOIZED_IS_INITIALIZED", 1);
            e = eVar2;
            e eVar3 = new e("BUILD_MESSAGE_INFO", 2);
            g = eVar3;
            e eVar4 = new e("NEW_MUTABLE_INSTANCE", 3);
            h = eVar4;
            e eVar5 = new e("NEW_BUILDER", 4);
            i = eVar5;
            e eVar6 = new e("GET_DEFAULT_INSTANCE", 5);
            j = eVar6;
            k = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, new e("GET_PARSER", 6)};
        }

        public e() {
            throw null;
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) k.clone();
        }
    }

    public static <T extends AbstractC0595Ak0<?, ?>> T r(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((AbstractC0595Ak0) C4356i92.b(cls)).q(e.j);
        if (t2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t2);
        return t2;
    }

    public static Object s(Method method, GZ0 gz0, Object... objArr) {
        try {
            return method.invoke(gz0, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <E> XB0.c<E> t(XB0.c<E> cVar) {
        int size = cVar.size();
        return cVar.l(size == 0 ? 10 : size * 2);
    }

    public static <T extends AbstractC0595Ak0<?, ?>> void u(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    @Override // defpackage.GZ0
    public final int a() {
        if (this.memoizedSerializedSize == -1) {
            C0596Ak1 c0596Ak1 = C0596Ak1.c;
            c0596Ak1.getClass();
            this.memoizedSerializedSize = c0596Ak1.a(getClass()).g(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // defpackage.GZ0
    public a b() {
        a aVar = (a) q(e.i);
        aVar.p();
        a.r(aVar.e, this);
        return aVar;
    }

    @Override // defpackage.JZ0
    public AbstractC0595Ak0 d() {
        return (AbstractC0595Ak0) q(e.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0596Ak1 c0596Ak1 = C0596Ak1.c;
        c0596Ak1.getClass();
        return c0596Ak1.a(getClass()).h(this, (AbstractC0595Ak0) obj);
    }

    @Override // defpackage.G0
    public final int f() {
        return this.memoizedSerializedSize;
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        C0596Ak1 c0596Ak1 = C0596Ak1.c;
        c0596Ak1.getClass();
        int iF = c0596Ak1.a(getClass()).f(this);
        this.memoizedHashCode = iF;
        return iF;
    }

    @Override // defpackage.GZ0
    public final void l(HE.a aVar) {
        C0596Ak1 c0596Ak1 = C0596Ak1.c;
        c0596Ak1.getClass();
        InterfaceC7779yD1 interfaceC7779yD1A = c0596Ak1.a(getClass());
        JE je = aVar.e;
        if (je == null) {
            je = new JE(aVar);
        }
        interfaceC7779yD1A.e(this, je);
    }

    @Override // defpackage.G0
    public final void o(int i) {
        this.memoizedSerializedSize = i;
    }

    public final <MessageType extends AbstractC0595Ak0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType p() {
        return (BuilderType) q(e.i);
    }

    public abstract Object q(e eVar);

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        MZ0.c(this, sb, 0);
        return sb.toString();
    }
}
