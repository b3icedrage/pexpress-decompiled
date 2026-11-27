package defpackage;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.sentry.android.core.b0;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class N01<Params, Progress, Result> {
    public static final ThreadPoolExecutor j;
    public static e k;
    public static volatile ThreadPoolExecutor l;
    public final b d;
    public final c e;
    public volatile f g = f.d;
    public final AtomicBoolean h = new AtomicBoolean();
    public final AtomicBoolean i = new AtomicBoolean();

    public static class a implements ThreadFactory {
        public final AtomicInteger d = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "ModernAsyncTask #" + this.d.getAndIncrement());
        }
    }

    public class b extends g<Params, Result> {
        public b() {
        }

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
        @Override // java.util.concurrent.Callable
        public final Result call() {
            N01 n01 = N01.this;
            n01.i.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = (Result) n01.a();
                Binder.flushPendingCommands();
                n01.d(result);
                return result;
            } catch (Throwable th) {
                try {
                    n01.h.set(true);
                    throw th;
                } catch (Throwable th2) {
                    n01.d(result);
                    throw th2;
                }
            }
        }
    }

    public class c extends FutureTask<Result> {
        public c(b bVar) {
            super(bVar);
        }

        @Override // java.util.concurrent.FutureTask
        public final void done() {
            N01 n01 = N01.this;
            AtomicBoolean atomicBoolean = n01.i;
            try {
                Result result = get();
                if (atomicBoolean.get()) {
                    return;
                }
                n01.d(result);
            } catch (InterruptedException e) {
                b0.a("AsyncTask", NG1.WARNING, null, e);
                b0.b(SG1.WARN, null, e);
            } catch (CancellationException unused) {
                if (atomicBoolean.get()) {
                    return;
                }
                n01.d(null);
            } catch (ExecutionException e2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e2.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    }

    public static class d<Data> {
        public final N01 a;
        public final Data[] b;

        public d(N01 n01, Data... dataArr) {
            this.a = n01;
            this.b = dataArr;
        }
    }

    public static class e extends Handler {
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
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            d dVar = (d) message.obj;
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                dVar.a.getClass();
            } else {
                N01 n01 = dVar.a;
                Object obj = dVar.b[0];
                if (n01.h.get()) {
                    n01.b(obj);
                } else {
                    n01.c(obj);
                }
                n01.g = f.g;
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        public static final f d;
        public static final f e;
        public static final f g;
        public static final /* synthetic */ f[] h;

        static {
            f fVar = new f("PENDING", 0);
            d = fVar;
            f fVar2 = new f("RUNNING", 1);
            e = fVar2;
            f fVar3 = new f("FINISHED", 2);
            g = fVar3;
            h = new f[]{fVar, fVar2, fVar3};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) h.clone();
        }
    }

    public static abstract class g<Params, Result> implements Callable<Result> {
    }

    static {
        a aVar = new a();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, UserVerificationMethods.USER_VERIFY_PATTERN, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), aVar);
        j = threadPoolExecutor;
        l = threadPoolExecutor;
    }

    public N01() {
        b bVar = new b();
        this.d = bVar;
        this.e = new c(bVar);
    }

    public abstract Object a();

    public final void d(Object obj) {
        e eVar;
        synchronized (N01.class) {
            try {
                if (k == null) {
                    k = new e(Looper.getMainLooper());
                }
                eVar = k;
            } catch (Throwable th) {
                throw th;
            }
        }
        eVar.obtainMessage(1, new d(this, obj)).sendToTarget();
    }

    public void b(Result result) {
    }

    public void c(Result result) {
    }
}
