package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class I90 {
    public static final int a = a(-1, Throwable.class);

    @NotNull
    public static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();

    @NotNull
    public static final WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> c = new WeakHashMap<>();

    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return BG.a(Integer.valueOf(((Constructor) t2).getParameterTypes().length), Integer.valueOf(((Constructor) t).getParameterTypes().length));
        }
    }

    public static final class b extends ML0 implements Function1 {
        public static final b d = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Throwable it = (Throwable) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }
    }

    public static final class c extends ML0 implements Function1 {
        public static final c d = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Throwable it = (Throwable) obj;
            Intrinsics.checkNotNullParameter(it, "it");
            return null;
        }
    }

    public static final int a(int i, Class cls) {
        Object objA;
        C7279vr.j(cls);
        try {
            C1717Ot1.a aVar = C1717Ot1.e;
            int i2 = 0;
            do {
                Field[] declaredFields = cls.getDeclaredFields();
                Intrinsics.checkNotNullExpressionValue(declaredFields, "declaredFields");
                int i3 = 0;
                for (Field field : declaredFields) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } while (cls != null);
            objA = Integer.valueOf(i2);
        } catch (Throwable th) {
            C1717Ot1.a aVar2 = C1717Ot1.e;
            objA = C1795Pt1.a(th);
        }
        Object objValueOf = Integer.valueOf(i);
        C1717Ot1.a aVar3 = C1717Ot1.e;
        if (objA instanceof C1717Ot1.b) {
            objA = objValueOf;
        }
        return ((Number) objA).intValue();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x010f A[EDGE_INSN: B:105:0x010f->B:64:0x010f BREAK  A[LOOP:3: B:41:0x00b3->B:108:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[LOOP:3: B:41:0x00b3->B:108:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public static final <E extends Throwable> E b(@NotNull E exception, @NotNull Throwable cause) {
        Object objA;
        Function1<Throwable, Throwable> h90;
        int i = 0;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(cause, "cause");
        if (exception instanceof InterfaceC3347dN) {
            try {
                C1717Ot1.a aVar = C1717Ot1.e;
                objA = ((InterfaceC3347dN) exception).a();
            } catch (Throwable th) {
                C1717Ot1.a aVar2 = C1717Ot1.e;
                objA = C1795Pt1.a(th);
            }
            return (E) (objA instanceof C1717Ot1.b ? null : objA);
        }
        ReentrantReadWriteLock reentrantReadWriteLock = b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        WeakHashMap<Class<? extends Throwable>, Function1<Throwable, Throwable>> weakHashMap = c;
        try {
            Function1<Throwable, Throwable> function1 = weakHashMap.get(exception.getClass());
            lock.unlock();
            if (function1 != null) {
                return (E) function1.invoke(exception);
            }
            if (a != a(0, exception.getClass())) {
                ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
                int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                for (int i2 = 0; i2 < readHoldCount; i2++) {
                    lock2.unlock();
                }
                ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    weakHashMap.put((Class<? extends Throwable>) exception.getClass(), b.d);
                    Unit unit = Unit.a;
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                    return null;
                } finally {
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                }
            }
            Constructor<?>[] constructors = exception.getClass().getConstructors();
            Intrinsics.checkNotNullExpressionValue(constructors, "exception.javaClass.constructors");
            Function1<Throwable, Throwable> function2 = null;
            for (Constructor constructor : C1526Mj.B(constructors, new a())) {
                Intrinsics.checkNotNullExpressionValue(constructor, "constructor");
                Class<?>[] parameterTypes = constructor.getParameterTypes();
                int length = parameterTypes.length;
                if (length != 0) {
                    if (length == 1) {
                        Class<?> cls = parameterTypes[0];
                        if (Intrinsics.a(cls, Throwable.class)) {
                            h90 = new F90(constructor);
                        } else if (Intrinsics.a(cls, String.class)) {
                            h90 = new G90(constructor);
                        } else {
                            function2 = null;
                        }
                    } else if (length == 2 && Intrinsics.a(parameterTypes[0], String.class) && Intrinsics.a(parameterTypes[1], Throwable.class)) {
                        h90 = new E90(constructor, 0);
                    } else {
                        function2 = null;
                    }
                    if (function2 != null) {
                        break;
                    }
                } else {
                    h90 = new H90(constructor, 0);
                }
                function2 = h90;
                if (function2 != null) {
                    break;
                    break;
                }
            }
            ReentrantReadWriteLock.ReadLock lock3 = reentrantReadWriteLock.readLock();
            int readHoldCount2 = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i3 = 0; i3 < readHoldCount2; i3++) {
                lock3.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock.writeLock();
            writeLock2.lock();
            try {
                weakHashMap.put((Class<? extends Throwable>) exception.getClass(), function2 == null ? c.d : function2);
                Unit unit2 = Unit.a;
                while (i < readHoldCount2) {
                    lock3.lock();
                    i++;
                }
                writeLock2.unlock();
                if (function2 != null) {
                    return (E) function2.invoke(cause);
                }
                return null;
            } catch (Throwable th2) {
                while (i < readHoldCount2) {
                    lock3.lock();
                    i++;
                }
                writeLock2.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            lock.unlock();
            throw th3;
        }
    }
}
