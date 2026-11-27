package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import io.jsonwebtoken.JwtParser;
import io.sentry.android.core.b0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"LQA1;", "", "<init>", "()V", R51.PUSH_ADDITIONAL_DATA_KEY, "b", "c", "d", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class QA1 {

    @Nullable
    public volatile C3213cj0 a;
    public Executor b;
    public InterfaceC3376dW1 c;
    public boolean e;

    @Nullable
    public ArrayList f;

    @NotNull
    public final Map<String, Object> j;

    @NotNull
    public final LinkedHashMap k;

    @NotNull
    public final C7775yC0 d = d();

    @NotNull
    public final LinkedHashMap g = new LinkedHashMap();

    @NotNull
    public final ReentrantReadWriteLock h = new ReentrantReadWriteLock();

    @NotNull
    public final ThreadLocal<Integer> i = new ThreadLocal<>();

    public static class a<T extends QA1> {

        @NotNull
        public final Context a;

        @NotNull
        public final Class<T> b;

        @Nullable
        public final String c;

        @NotNull
        public final ArrayList d;

        @NotNull
        public final ArrayList e;

        @NotNull
        public final ArrayList f;

        @Nullable
        public Executor g;

        @Nullable
        public Executor h;

        @Nullable
        public C5959pa2 i;
        public boolean j;

        @NotNull
        public final c k;
        public boolean l;
        public boolean m;
        public final long n;

        @NotNull
        public final d o;

        @NotNull
        public final LinkedHashSet p;

        @Nullable
        public HashSet q;

        public a(@NotNull Context context, @NotNull Class<T> klass, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.a = context;
            this.b = klass;
            this.c = str;
            this.d = new ArrayList();
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.k = c.d;
            this.l = true;
            this.n = -1L;
            this.o = new d();
            this.p = new LinkedHashSet();
        }

        @NotNull
        public final void a(@NotNull AbstractC3899g01... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.q == null) {
                this.q = new HashSet();
            }
            for (AbstractC3899g01 abstractC3899g01 : migrations) {
                HashSet hashSet = this.q;
                Intrinsics.checkNotNull(hashSet);
                hashSet.add(Integer.valueOf(abstractC3899g01.a));
                HashSet hashSet2 = this.q;
                Intrinsics.checkNotNull(hashSet2);
                hashSet2.add(Integer.valueOf(abstractC3899g01.b));
            }
            this.o.a((AbstractC3899g01[]) Arrays.copyOf(migrations, migrations.length));
        }

        @NotNull
        public final T b() {
            Executor executor = this.g;
            if (executor == null && this.h == null) {
                ExecutorC3631ej executorC3631ej = C3841fj.g;
                this.h = executorC3631ej;
                this.g = executorC3631ej;
            } else if (executor != null && this.h == null) {
                this.h = executor;
            } else if (executor == null) {
                this.g = this.h;
            }
            HashSet hashSet = this.q;
            LinkedHashSet linkedHashSet = this.p;
            if (hashSet != null) {
                Intrinsics.checkNotNull(hashSet);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(EK.e(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                    }
                }
            }
            InterfaceC3376dW1.c c0957Fb = this.i;
            if (c0957Fb == null) {
                c0957Fb = new C0957Fb();
            }
            InterfaceC3376dW1.c cVar = c0957Fb;
            if (this.n > 0) {
                if (this.c != null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            ArrayList arrayList = this.d;
            boolean z = this.j;
            c cVar2 = this.k;
            cVar2.getClass();
            Context context = this.a;
            Intrinsics.checkNotNullParameter(context, "context");
            c cVar3 = c.d;
            c cVar4 = c.g;
            if (cVar2 == cVar3) {
                Object systemService = context.getSystemService("activity");
                Intrinsics.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
                ActivityManager activityManager = (ActivityManager) systemService;
                Intrinsics.checkNotNullParameter(activityManager, "activityManager");
                cVar2 = !activityManager.isLowRamDevice() ? cVar4 : c.e;
            }
            Executor executor2 = this.g;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.h;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C4882kT databaseConfiguration = new C4882kT(context, this.c, cVar, this.o, arrayList, z, cVar2, executor2, executor3, this.l, this.m, linkedHashSet, this.e, this.f);
            Class<T> klass = this.b;
            Intrinsics.checkNotNullParameter(klass, "klass");
            Intrinsics.checkNotNullParameter("_Impl", "suffix");
            Package r6 = klass.getPackage();
            Intrinsics.checkNotNull(r6);
            String fullPackage = r6.getName();
            String canonicalName = klass.getCanonicalName();
            Intrinsics.checkNotNull(canonicalName);
            Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
            if (fullPackage.length() != 0) {
                canonicalName = canonicalName.substring(fullPackage.length() + 1);
                Intrinsics.checkNotNullExpressionValue(canonicalName, "this as java.lang.String).substring(startIndex)");
            }
            String str = kotlin.text.d.l(canonicalName, JwtParser.SEPARATOR_CHAR, '_') + "_Impl";
            try {
                Class<?> cls = Class.forName(fullPackage.length() == 0 ? str : fullPackage + JwtParser.SEPARATOR_CHAR + str, true, klass.getClassLoader());
                Intrinsics.c(cls, "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>");
                T t = (T) cls.newInstance();
                t.getClass();
                Intrinsics.checkNotNullParameter(databaseConfiguration, "configuration");
                t.c = t.e(databaseConfiguration);
                Set<Class<? extends C3057c>> setH = t.h();
                BitSet bitSet = new BitSet();
                Iterator<Class<? extends C3057c>> it2 = setH.iterator();
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    LinkedHashMap linkedHashMap = t.g;
                    ArrayList arrayList2 = databaseConfiguration.n;
                    int i = -1;
                    if (zHasNext) {
                        Class<? extends C3057c> next = it2.next();
                        int size = arrayList2.size() - 1;
                        if (size >= 0) {
                            while (true) {
                                int i2 = size - 1;
                                if (next.isAssignableFrom(arrayList2.get(size).getClass())) {
                                    bitSet.set(size);
                                    i = size;
                                    break;
                                }
                                if (i2 < 0) {
                                    break;
                                }
                                size = i2;
                            }
                        }
                        if (i < 0) {
                            throw new IllegalArgumentException(("A required auto migration spec (" + next.getCanonicalName() + ") is missing in the database configuration.").toString());
                        }
                        linkedHashMap.put(next, arrayList2.get(i));
                    } else {
                        int size2 = arrayList2.size() - 1;
                        if (size2 >= 0) {
                            while (true) {
                                int i3 = size2 - 1;
                                if (!bitSet.get(size2)) {
                                    throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                                }
                                if (i3 < 0) {
                                    break;
                                }
                                size2 = i3;
                            }
                        }
                        Iterator it3 = t.f(linkedHashMap).iterator();
                        while (true) {
                            boolean zContainsKey = false;
                            if (!it3.hasNext()) {
                                break;
                            }
                            AbstractC3899g01 abstractC3899g01 = (AbstractC3899g01) it3.next();
                            int i4 = abstractC3899g01.a;
                            d dVar = databaseConfiguration.d;
                            LinkedHashMap linkedHashMap2 = dVar.a;
                            if (linkedHashMap2.containsKey(Integer.valueOf(i4))) {
                                Map mapC = (Map) linkedHashMap2.get(Integer.valueOf(i4));
                                if (mapC == null) {
                                    mapC = PW0.c();
                                }
                                zContainsKey = mapC.containsKey(Integer.valueOf(abstractC3899g01.b));
                            }
                            if (!zContainsKey) {
                                dVar.a(abstractC3899g01);
                            }
                        }
                        if (((MB1) QA1.o(MB1.class, t.g())) != null) {
                            Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
                        }
                        if (((C3228cn) QA1.o(C3228cn.class, t.g())) != null) {
                            throw null;
                        }
                        t.g().setWriteAheadLoggingEnabled(databaseConfiguration.g == cVar4);
                        t.f = databaseConfiguration.e;
                        t.b = databaseConfiguration.h;
                        Executor executor4 = databaseConfiguration.i;
                        Intrinsics.checkNotNullParameter(executor4, "executor");
                        new ArrayDeque();
                        t.e = databaseConfiguration.f;
                        Map<Class<?>, List<Class<?>>> mapI = t.i();
                        BitSet bitSet2 = new BitSet();
                        Iterator<Map.Entry<Class<?>, List<Class<?>>>> it4 = mapI.entrySet().iterator();
                        while (true) {
                            boolean zHasNext2 = it4.hasNext();
                            ArrayList arrayList3 = databaseConfiguration.m;
                            if (!zHasNext2) {
                                int size3 = arrayList3.size() - 1;
                                if (size3 >= 0) {
                                    while (true) {
                                        int i5 = size3 - 1;
                                        if (!bitSet2.get(size3)) {
                                            throw new IllegalArgumentException("Unexpected type converter " + arrayList3.get(size3) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                        }
                                        if (i5 >= 0) {
                                            size3 = i5;
                                        }
                                    }
                                }
                                return t;
                            }
                            Map.Entry<Class<?>, List<Class<?>>> next2 = it4.next();
                            Class<?> key = next2.getKey();
                            for (Class<?> cls2 : next2.getValue()) {
                                int size4 = arrayList3.size() - 1;
                                if (size4 < 0) {
                                    size4 = -1;
                                    break;
                                }
                                while (true) {
                                    int i6 = size4 - 1;
                                    if (cls2.isAssignableFrom(arrayList3.get(size4).getClass())) {
                                        bitSet2.set(size4);
                                        break;
                                    }
                                    if (i6 < 0) {
                                        size4 = -1;
                                        break;
                                    }
                                    size4 = i6;
                                }
                                if (!(size4 >= 0)) {
                                    throw new IllegalArgumentException(("A required type converter (" + cls2 + ") for " + key.getCanonicalName() + " is missing in the database configuration.").toString());
                                }
                                t.k.put(cls2, arrayList3.get(size4));
                            }
                        }
                    }
                }
            } catch (ClassNotFoundException unused) {
                throw new RuntimeException("Cannot find implementation for " + klass.getCanonicalName() + ". " + str + " does not exist");
            } catch (IllegalAccessException unused2) {
                throw new RuntimeException("Cannot access the constructor " + klass + ".canonicalName");
            } catch (InstantiationException unused3) {
                throw new RuntimeException("Failed to create an instance of " + klass + ".canonicalName");
            }
        }
    }

    public static abstract class b {
        public void a(@NotNull C3213cj0 db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class c {
        public static final c d;
        public static final c e;
        public static final c g;
        public static final /* synthetic */ c[] h;

        static {
            c cVar = new c("AUTOMATIC", 0);
            d = cVar;
            c cVar2 = new c("TRUNCATE", 1);
            e = cVar2;
            c cVar3 = new c("WRITE_AHEAD_LOGGING", 2);
            g = cVar3;
            h = new c[]{cVar, cVar2, cVar3};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) h.clone();
        }
    }

    public static class d {

        @NotNull
        public final LinkedHashMap a = new LinkedHashMap();

        public final void a(@NotNull AbstractC3899g01... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (AbstractC3899g01 abstractC3899g01 : migrations) {
                int i = abstractC3899g01.a;
                LinkedHashMap linkedHashMap = this.a;
                Integer numValueOf = Integer.valueOf(i);
                Object treeMap = linkedHashMap.get(numValueOf);
                if (treeMap == null) {
                    treeMap = new TreeMap();
                    linkedHashMap.put(numValueOf, treeMap);
                }
                TreeMap treeMap2 = (TreeMap) treeMap;
                int i2 = abstractC3899g01.b;
                if (treeMap2.containsKey(Integer.valueOf(i2))) {
                    b0.e("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i2)) + " with " + abstractC3899g01);
                }
                treeMap2.put(Integer.valueOf(i2), abstractC3899g01);
            }
        }
    }

    public QA1() {
        Map<String, Object> mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.j = mapSynchronizedMap;
        this.k = new LinkedHashMap();
    }

    public static Object o(Class cls, InterfaceC3376dW1 interfaceC3376dW1) {
        if (cls.isInstance(interfaceC3376dW1)) {
            return interfaceC3376dW1;
        }
        if (interfaceC3376dW1 instanceof UW) {
            return o(cls, ((UW) interfaceC3376dW1).c());
        }
        return null;
    }

    public final void a() {
        if (!this.e && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!g().A0().T0() && this.i.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        InterfaceC3166cW1 interfaceC3166cW1A0 = g().A0();
        this.d.c(interfaceC3166cW1A0);
        if (interfaceC3166cW1A0.e1()) {
            interfaceC3166cW1A0.r0();
        } else {
            interfaceC3166cW1A0.x();
        }
    }

    @NotNull
    public abstract C7775yC0 d();

    @NotNull
    public abstract InterfaceC3376dW1 e(@NotNull C4882kT c4882kT);

    @NotNull
    public List f(@NotNull LinkedHashMap autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return C5653o60.d;
    }

    @NotNull
    public final InterfaceC3376dW1 g() {
        InterfaceC3376dW1 interfaceC3376dW1 = this.c;
        if (interfaceC3376dW1 != null) {
            return interfaceC3376dW1;
        }
        Intrinsics.l("internalOpenHelper");
        throw null;
    }

    @NotNull
    public Set<Class<? extends C3057c>> h() {
        return C6702t60.d;
    }

    @NotNull
    public Map<Class<?>, List<Class<?>>> i() {
        return PW0.c();
    }

    public final void j() {
        g().A0().F0();
        if (g().A0().T0()) {
            return;
        }
        C7775yC0 c7775yC0 = this.d;
        if (c7775yC0.e.compareAndSet(false, true)) {
            Executor executor = c7775yC0.a.b;
            if (executor != null) {
                executor.execute(c7775yC0.l);
            } else {
                Intrinsics.l("internalQueryExecutor");
                throw null;
            }
        }
    }

    public final void k(@NotNull C3213cj0 database) {
        Intrinsics.checkNotNullParameter(database, "db");
        C7775yC0 c7775yC0 = this.d;
        c7775yC0.getClass();
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (c7775yC0.k) {
            if (c7775yC0.f) {
                b0.c("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.E("PRAGMA temp_store = MEMORY;");
            database.E("PRAGMA recursive_triggers='ON';");
            database.E("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            c7775yC0.c(database);
            c7775yC0.g = database.N("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            c7775yC0.f = true;
            Unit unit = Unit.a;
        }
    }

    @NotNull
    public final Cursor l(@NotNull InterfaceC3795fW1 query) {
        Intrinsics.checkNotNullParameter(query, "query");
        a();
        b();
        return g().A0().y(query);
    }

    public final <V> V m(@NotNull Callable<V> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        c();
        try {
            V vCall = body.call();
            n();
            return vCall;
        } finally {
            j();
        }
    }

    public final void n() {
        g().A0().p0();
    }
}
