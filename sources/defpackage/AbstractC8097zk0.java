package defpackage;

import com.google.android.gms.common.api.Api;
import defpackage.AbstractC8097zk0;
import defpackage.AbstractC8097zk0.a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: zk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8097zk0<MessageType extends AbstractC8097zk0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends F0<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC8097zk0<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected P82 unknownFields = P82.f;

    /* JADX INFO: renamed from: zk0$a */
    public static abstract class a<MessageType extends AbstractC8097zk0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends F0.a<MessageType, BuilderType> {
        public final MessageType d;
        public MessageType e;

        public a(MessageType messagetype) {
            this.d = messagetype;
            if (messagetype.m()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.e = (MessageType) messagetype.o();
        }

        public final Object clone() {
            a aVar = (a) this.d.i(f.i);
            aVar.e = (MessageType) i();
            return aVar;
        }

        public final MessageType h() {
            MessageType messagetype = (MessageType) i();
            messagetype.getClass();
            if (AbstractC8097zk0.l(messagetype, true)) {
                return messagetype;
            }
            throw new D82();
        }

        public final MessageType i() {
            if (!this.e.m()) {
                return this.e;
            }
            MessageType messagetype = this.e;
            messagetype.getClass();
            C0674Bk1 c0674Bk1 = C0674Bk1.c;
            c0674Bk1.getClass();
            c0674Bk1.a(messagetype.getClass()).b(messagetype);
            messagetype.n();
            return this.e;
        }

        public final void j() {
            if (this.e.m()) {
                return;
            }
            MessageType messagetype = (MessageType) this.d.o();
            MessageType messagetype2 = this.e;
            C0674Bk1 c0674Bk1 = C0674Bk1.c;
            c0674Bk1.getClass();
            c0674Bk1.a(messagetype.getClass()).a(messagetype, messagetype2);
            this.e = messagetype;
        }
    }

    /* JADX INFO: renamed from: zk0$b */
    public static class b<T extends AbstractC8097zk0<T, ?>> extends R0<T> {
    }

    /* JADX INFO: renamed from: zk0$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC8097zk0<MessageType, BuilderType> implements LZ0 {
        protected C0571Ac0<d> extensions = C0571Ac0.d;

        @Override // defpackage.AbstractC8097zk0, defpackage.LZ0
        public final AbstractC8097zk0 d() {
            return (AbstractC8097zk0) i(f.j);
        }

        @Override // defpackage.AbstractC8097zk0, defpackage.IZ0
        public final a g() {
            return (a) i(f.i);
        }
    }

    /* JADX INFO: renamed from: zk0$d */
    public static final class d implements C0571Ac0.a<d> {
        @Override // defpackage.C0571Ac0.a
        public final EnumC7885yj2 a() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }
    }

    /* JADX INFO: renamed from: zk0$e */
    public static class e<ContainingType extends IZ0, Type> extends G1 {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: zk0$f */
    public static final class f {
        public static final f d;
        public static final f e;
        public static final f g;
        public static final f h;
        public static final f i;
        public static final f j;
        public static final /* synthetic */ f[] k;

        static {
            f fVar = new f("GET_MEMOIZED_IS_INITIALIZED", 0);
            d = fVar;
            f fVar2 = new f("SET_MEMOIZED_IS_INITIALIZED", 1);
            e = fVar2;
            f fVar3 = new f("BUILD_MESSAGE_INFO", 2);
            g = fVar3;
            f fVar4 = new f("NEW_MUTABLE_INSTANCE", 3);
            h = fVar4;
            f fVar5 = new f("NEW_BUILDER", 4);
            i = fVar5;
            f fVar6 = new f("GET_DEFAULT_INSTANCE", 5);
            j = fVar6;
            k = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, new f("GET_PARSER", 6)};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) k.clone();
        }
    }

    public static <T extends AbstractC8097zk0<?, ?>> T j(Class<T> cls) {
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
        T t2 = (T) ((AbstractC8097zk0) C4614j92.d(cls)).i(f.j);
        if (t2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, t2);
        return t2;
    }

    public static Object k(Method method, IZ0 iz0, Object... objArr) {
        try {
            return method.invoke(iz0, objArr);
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

    public static final <T extends AbstractC8097zk0<T, ?>> boolean l(T t, boolean z) {
        byte bByteValue = ((Byte) t.i(f.d)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C0674Bk1 c0674Bk1 = C0674Bk1.c;
        c0674Bk1.getClass();
        boolean zC = c0674Bk1.a(t.getClass()).c(t);
        if (z) {
            t.i(f.e);
        }
        return zC;
    }

    public static <T extends AbstractC8097zk0<?, ?>> void p(Class<T> cls, T t) {
        t.n();
        defaultInstanceMap.put(cls, t);
    }

    @Override // defpackage.IZ0
    public final int a() {
        return f(null);
    }

    @Override // defpackage.IZ0
    public final void b(GE ge) {
        C0674Bk1 c0674Bk1 = C0674Bk1.c;
        c0674Bk1.getClass();
        InterfaceC7989zD1 interfaceC7989zD1A = c0674Bk1.a(getClass());
        KE ke = ge.e;
        if (ke == null) {
            ke = new KE(ge);
        }
        interfaceC7989zD1A.h(this, ke);
    }

    @Override // defpackage.F0
    public final int c() {
        return this.memoizedSerializedSize & Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // defpackage.LZ0
    public AbstractC8097zk0 d() {
        return (AbstractC8097zk0) i(f.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0674Bk1 c0674Bk1 = C0674Bk1.c;
        c0674Bk1.getClass();
        return c0674Bk1.a(getClass()).d(this, (AbstractC8097zk0) obj);
    }

    @Override // defpackage.F0
    public final int f(InterfaceC7989zD1 interfaceC7989zD1) {
        int iG;
        int iG2;
        if (m()) {
            if (interfaceC7989zD1 == null) {
                C0674Bk1 c0674Bk1 = C0674Bk1.c;
                c0674Bk1.getClass();
                iG2 = c0674Bk1.a(getClass()).g(this);
            } else {
                iG2 = interfaceC7989zD1.g(this);
            }
            if (iG2 >= 0) {
                return iG2;
            }
            throw new IllegalStateException(EK.e(iG2, "serialized size must be non-negative, was "));
        }
        if (c() != Integer.MAX_VALUE) {
            return c();
        }
        if (interfaceC7989zD1 == null) {
            C0674Bk1 c0674Bk2 = C0674Bk1.c;
            c0674Bk2.getClass();
            iG = c0674Bk2.a(getClass()).g(this);
        } else {
            iG = interfaceC7989zD1.g(this);
        }
        h(iG);
        return iG;
    }

    @Override // defpackage.IZ0
    public a g() {
        return (a) i(f.i);
    }

    @Override // defpackage.F0
    public final void h(int i) {
        if (i < 0) {
            throw new IllegalStateException(EK.e(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Api.BaseClientBuilder.API_PRIORITY_OTHER) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final int hashCode() {
        if (m()) {
            C0674Bk1 c0674Bk1 = C0674Bk1.c;
            c0674Bk1.getClass();
            return c0674Bk1.a(getClass()).f(this);
        }
        if (this.memoizedHashCode == 0) {
            C0674Bk1 c0674Bk2 = C0674Bk1.c;
            c0674Bk2.getClass();
            this.memoizedHashCode = c0674Bk2.a(getClass()).f(this);
        }
        return this.memoizedHashCode;
    }

    public abstract Object i(f fVar);

    public final boolean m() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void n() {
        this.memoizedSerializedSize &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public final MessageType o() {
        return (MessageType) i(f.h);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = NZ0.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        NZ0.c(this, sb, 0);
        return sb.toString();
    }
}
