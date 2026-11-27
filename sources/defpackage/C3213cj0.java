package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.util.Pair;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: cj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3213cj0 implements InterfaceC3166cW1 {

    @NotNull
    public static final String[] g = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    @NotNull
    public static final String[] h = new String[0];

    @NotNull
    public final SQLiteDatabase d;

    @Nullable
    public final List<Pair<String, String>> e;

    /* JADX INFO: renamed from: cj0$a */
    public static final class a extends ML0 implements InterfaceC1138Hj0<SQLiteDatabase, SQLiteCursorDriver, String, SQLiteQuery, SQLiteCursor> {
        public final /* synthetic */ InterfaceC3795fW1 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3795fW1 interfaceC3795fW1) {
            super(4);
            this.d = interfaceC3795fW1;
        }

        @Override // defpackage.InterfaceC1138Hj0
        public final SQLiteCursor l(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            SQLiteQuery sQLiteQuery2 = sQLiteQuery;
            Intrinsics.checkNotNull(sQLiteQuery2);
            this.d.f(new C3842fj0(sQLiteQuery2));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery2);
        }
    }

    public C3213cj0(@NotNull SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.d = delegate;
        this.e = delegate.getAttachedDbs();
    }

    @Override // defpackage.InterfaceC3166cW1
    public final void E(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.d.execSQL(sql);
    }

    @Override // defpackage.InterfaceC3166cW1
    public final void F0() {
        this.d.endTransaction();
    }

    @Override // defpackage.InterfaceC3166cW1
    @NotNull
    public final InterfaceC4005gW1 N(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.d.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new C4052gj0(sQLiteStatementCompileStatement);
    }

    @Override // defpackage.InterfaceC3166cW1
    public final boolean T0() {
        return this.d.inTransaction();
    }

    public final void c(@NotNull Object[] bindArgs) {
        Intrinsics.checkNotNullParameter("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.d.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", bindArgs);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.InterfaceC3166cW1
    public final boolean e1() {
        SQLiteDatabase sQLiteDatabase = this.d;
        Intrinsics.checkNotNullParameter(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }

    @NotNull
    public final Cursor f(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return y(new C5496nM1(query));
    }

    @Override // defpackage.InterfaceC3166cW1
    public final void p0() {
        this.d.setTransactionSuccessful();
    }

    @Override // defpackage.InterfaceC3166cW1
    public final void r0() {
        this.d.beginTransactionNonExclusive();
    }

    @Override // defpackage.InterfaceC3166cW1
    public final void x() {
        this.d.beginTransaction();
    }

    @Override // defpackage.InterfaceC3166cW1
    @NotNull
    public final Cursor y(@NotNull InterfaceC3795fW1 query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final a aVar = new a(query);
        Cursor cursorRawQueryWithFactory = this.d.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: bj0
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                C3213cj0.a tmp0 = aVar;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                return (Cursor) tmp0.l(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, query.c(), h, null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }
}
