package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: renamed from: Sd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1981Sd1 {
    public static final C1981Sd1 b;

    @Nullable
    public final Constructor<MethodHandles.Lookup> a;

    /* JADX INFO: renamed from: Sd1$a */
    public static final class a extends C1981Sd1 {

        /* JADX INFO: renamed from: Sd1$a$a, reason: collision with other inner class name */
        public static final class ExecutorC0140a implements Executor {
            public final Handler d = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.d.post(runnable);
            }
        }

        @Override // defpackage.C1981Sd1
        public final Executor a() {
            return new ExecutorC0140a();
        }

        @Override // defpackage.C1981Sd1
        @Nullable
        public final Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.b(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        b = "Dalvik".equals(System.getProperty("java.vm.name")) ? new a() : new C1981Sd1();
    }

    public C1981Sd1() {
        Constructor<MethodHandles.Lookup> declaredConstructor = null;
        try {
            declaredConstructor = C4633jG.b().getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
        } catch (NoClassDefFoundError | NoSuchMethodException unused) {
        }
        this.a = declaredConstructor;
    }

    @Nullable
    public Executor a() {
        return null;
    }

    @Nullable
    @IgnoreJRERequirement
    public Object b(Method method, Class<?> cls, Object obj, Object... objArr) {
        Constructor<MethodHandles.Lookup> constructor = this.a;
        return (constructor != null ? C6480s30.b(constructor.newInstance(cls, -1)) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
