package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import io.sentry.android.core.b0;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3423dj0 implements InterfaceC3376dW1 {

    @NotNull
    public final Context d;

    @Nullable
    public final String e;

    @NotNull
    public final InterfaceC3376dW1.a g;
    public final boolean h;
    public final boolean i;

    @NotNull
    public final KW1 j;
    public boolean k;

    /* JADX INFO: renamed from: dj0$a */
    public static final class a {

        @Nullable
        public C3213cj0 a = null;
    }

    /* JADX INFO: renamed from: dj0$b */
    public static final class b extends SQLiteOpenHelper {
        public static final /* synthetic */ int l = 0;

        @NotNull
        public final Context d;

        @NotNull
        public final a e;

        @NotNull
        public final InterfaceC3376dW1.a g;
        public final boolean h;
        public boolean i;

        @NotNull
        public final C7876yh1 j;
        public boolean k;

        /* JADX INFO: renamed from: dj0$b$a */
        public static final class a extends RuntimeException {

            @NotNull
            public final EnumC0340b d;

            @NotNull
            public final Throwable e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull EnumC0340b callbackName, @NotNull Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.d = callbackName;
                this.e = cause;
            }

            @Override // java.lang.Throwable
            @NotNull
            public final Throwable getCause() {
                return this.e;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: dj0$b$b, reason: collision with other inner class name */
        public static final class EnumC0340b {
            public static final EnumC0340b d;
            public static final EnumC0340b e;
            public static final EnumC0340b g;
            public static final EnumC0340b h;
            public static final EnumC0340b i;
            public static final /* synthetic */ EnumC0340b[] j;

            static {
                EnumC0340b enumC0340b = new EnumC0340b("ON_CONFIGURE", 0);
                d = enumC0340b;
                EnumC0340b enumC0340b2 = new EnumC0340b("ON_CREATE", 1);
                e = enumC0340b2;
                EnumC0340b enumC0340b3 = new EnumC0340b("ON_UPGRADE", 2);
                g = enumC0340b3;
                EnumC0340b enumC0340b4 = new EnumC0340b("ON_DOWNGRADE", 3);
                h = enumC0340b4;
                EnumC0340b enumC0340b5 = new EnumC0340b("ON_OPEN", 4);
                i = enumC0340b5;
                j = new EnumC0340b[]{enumC0340b, enumC0340b2, enumC0340b3, enumC0340b4, enumC0340b5};
            }

            public EnumC0340b() {
                throw null;
            }

            public static EnumC0340b valueOf(String str) {
                return (EnumC0340b) Enum.valueOf(EnumC0340b.class, str);
            }

            public static EnumC0340b[] values() {
                return (EnumC0340b[]) j.clone();
            }
        }

        /* JADX INFO: renamed from: dj0$b$c */
        public static final class c {
            @NotNull
            public static C3213cj0 a(@NotNull a refHolder, @NotNull SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                C3213cj0 c3213cj0 = refHolder.a;
                if (c3213cj0 != null) {
                    Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                    if (Intrinsics.a(c3213cj0.d, sqLiteDatabase)) {
                        return c3213cj0;
                    }
                }
                C3213cj0 c3213cj1 = new C3213cj0(sqLiteDatabase);
                refHolder.a = c3213cj1;
                return c3213cj1;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull Context context, @Nullable String str, @NotNull final a dbRef, @NotNull final InterfaceC3376dW1.a callback, boolean z) {
            String string;
            super(context, str, null, callback.a, new DatabaseErrorHandler() { // from class: ej0
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase dbObj) {
                    InterfaceC3376dW1.a callback2 = callback;
                    Intrinsics.checkNotNullParameter(callback2, "$callback");
                    C3423dj0.a dbRef2 = dbRef;
                    Intrinsics.checkNotNullParameter(dbRef2, "$dbRef");
                    int i = C3423dj0.b.l;
                    Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
                    C3213cj0 db = C3423dj0.b.c.a(dbRef2, dbObj);
                    callback2.getClass();
                    Intrinsics.checkNotNullParameter(db, "db");
                    b0.c("SupportSQLite", "Corruption reported by sqlite on database: " + db + ".path");
                    SQLiteDatabase sQLiteDatabase = db.d;
                    if (!sQLiteDatabase.isOpen()) {
                        String path = sQLiteDatabase.getPath();
                        if (path != null) {
                            InterfaceC3376dW1.a.a(path);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> list = null;
                    try {
                        try {
                            list = db.e;
                        } finally {
                            if (list != null) {
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    Object obj = ((Pair) it.next()).second;
                                    Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                                    InterfaceC3376dW1.a.a((String) obj);
                                }
                            } else {
                                String path2 = sQLiteDatabase.getPath();
                                if (path2 != null) {
                                    InterfaceC3376dW1.a.a(path2);
                                }
                            }
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
                        db.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                }
            });
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.d = context;
            this.e = dbRef;
            this.g = callback;
            this.h = z;
            if (str == null) {
                string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            } else {
                string = str;
            }
            File cacheDir = context.getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "context.cacheDir");
            this.j = new C7876yh1(string, cacheDir, false);
        }

        @NotNull
        public final InterfaceC3166cW1 c(boolean z) {
            C7876yh1 c7876yh1 = this.j;
            try {
                c7876yh1.a((this.k || getDatabaseName() == null) ? false : true);
                this.i = false;
                SQLiteDatabase sQLiteDatabaseK = k(z);
                if (!this.i) {
                    return f(sQLiteDatabaseK);
                }
                close();
                return c(z);
            } finally {
                c7876yh1.b();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            C7876yh1 c7876yh1 = this.j;
            try {
                c7876yh1.a(c7876yh1.a);
                super.close();
                this.e.a = null;
                this.k = false;
            } finally {
                c7876yh1.b();
            }
        }

        @NotNull
        public final C3213cj0 f(@NotNull SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return c.a(this.e, sqLiteDatabase);
        }

        public final SQLiteDatabase g(boolean z) {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        public final SQLiteDatabase k(boolean z) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            Context context = this.d;
            if (databaseName != null && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    b0.e("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return g(z);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return g(z);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        int iOrdinal = aVar.d.ordinal();
                        Throwable th2 = aVar.e;
                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || !(th2 instanceof SQLiteException)) {
                            throw th2;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.h) {
                        throw th;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        return g(z);
                    } catch (a e) {
                        throw e.e;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(@NotNull SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            try {
                this.g.b(f(db));
            } catch (Throwable th) {
                throw new a(EnumC0340b.d, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(@NotNull SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.g.c(f(sqLiteDatabase));
            } catch (Throwable th) {
                throw new a(EnumC0340b.e, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(@NotNull SQLiteDatabase db, int i, int i2) {
            Intrinsics.checkNotNullParameter(db, "db");
            this.i = true;
            try {
                this.g.d(f(db), i, i2);
            } catch (Throwable th) {
                throw new a(EnumC0340b.h, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(@NotNull SQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            if (!this.i) {
                try {
                    this.g.e(f(db));
                } catch (Throwable th) {
                    throw new a(EnumC0340b.i, th);
                }
            }
            this.k = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(@NotNull SQLiteDatabase sqLiteDatabase, int i, int i2) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.i = true;
            try {
                this.g.f(f(sqLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new a(EnumC0340b.g, th);
            }
        }
    }

    /* JADX INFO: renamed from: dj0$c */
    public static final class c extends ML0 implements Function0<b> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final b invoke() {
            b sQLiteOpenHelper;
            C3423dj0 c3423dj0 = C3423dj0.this;
            if (c3423dj0.e == null || !c3423dj0.h) {
                sQLiteOpenHelper = new b(c3423dj0.d, c3423dj0.e, new a(), c3423dj0.g, c3423dj0.i);
            } else {
                Context context = c3423dj0.d;
                Intrinsics.checkNotNullParameter(context, "context");
                File noBackupFilesDir = context.getNoBackupFilesDir();
                Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "context.noBackupFilesDir");
                sQLiteOpenHelper = new b(c3423dj0.d, new File(noBackupFilesDir, c3423dj0.e).getAbsolutePath(), new a(), c3423dj0.g, c3423dj0.i);
            }
            boolean z = c3423dj0.k;
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
            return sQLiteOpenHelper;
        }
    }

    public C3423dj0(@NotNull Context context, @Nullable String str, @NotNull InterfaceC3376dW1.a callback, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.d = context;
        this.e = str;
        this.g = callback;
        this.h = z;
        this.i = z2;
        this.j = XO0.b(new c());
    }

    @Override // defpackage.InterfaceC3376dW1
    @NotNull
    public final InterfaceC3166cW1 A0() {
        return ((b) this.j.getValue()).c(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        KW1 kw1 = this.j;
        if (kw1.d()) {
            ((b) kw1.getValue()).close();
        }
    }

    @Override // defpackage.InterfaceC3376dW1
    @Nullable
    public final String getDatabaseName() {
        return this.e;
    }

    @Override // defpackage.InterfaceC3376dW1
    public final void setWriteAheadLoggingEnabled(boolean z) {
        KW1 kw1 = this.j;
        if (kw1.d()) {
            b sQLiteOpenHelper = (b) kw1.getValue();
            Intrinsics.checkNotNullParameter(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z);
        }
        this.k = z;
    }

    @Override // defpackage.InterfaceC3376dW1
    @NotNull
    public final InterfaceC3166cW1 t0() {
        return ((b) this.j.getValue()).c(false);
    }
}
