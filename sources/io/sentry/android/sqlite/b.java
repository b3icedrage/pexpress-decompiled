package io.sentry.android.sqlite;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.CrossProcessCursor;
import android.database.CursorWindow;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import defpackage.ML0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements CrossProcessCursor {

    @NotNull
    public final CrossProcessCursor d;

    @NotNull
    public final io.sentry.android.sqlite.a e;

    @NotNull
    public final String g;
    public boolean h;

    public static final class a extends ML0 implements Function0<Unit> {
        public final /* synthetic */ int e;
        public final /* synthetic */ CursorWindow g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, CursorWindow cursorWindow) {
            super(0);
            this.e = i;
            this.g = cursorWindow;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            b.this.d.fillWindow(this.e, this.g);
            return Unit.a;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.sqlite.b$b, reason: collision with other inner class name */
    public static final class C0391b extends ML0 implements Function0<Integer> {
        public C0391b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(b.this.d.getCount());
        }
    }

    public static final class c extends ML0 implements Function0<Boolean> {
        public final /* synthetic */ int e;
        public final /* synthetic */ int g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i, int i2) {
            super(0);
            this.e = i;
            this.g = i2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(b.this.d.onMove(this.e, this.g));
        }
    }

    public b(@NotNull CrossProcessCursor delegate, @NotNull io.sentry.android.sqlite.a spanManager, @NotNull String sql) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(spanManager, "spanManager");
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.d = delegate;
        this.e = spanManager;
        this.g = sql;
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // android.database.Cursor
    public final void copyStringToBuffer(int i, CharArrayBuffer charArrayBuffer) {
        this.d.copyStringToBuffer(i, charArrayBuffer);
    }

    @Override // android.database.Cursor
    public final void deactivate() {
        this.d.deactivate();
    }

    @Override // android.database.CrossProcessCursor
    public final void fillWindow(int i, @Nullable CursorWindow cursorWindow) {
        if (this.h) {
            this.d.fillWindow(i, cursorWindow);
            return;
        }
        this.h = true;
        this.e.a(this.g, new a(i, cursorWindow));
    }

    @Override // android.database.Cursor
    public final byte[] getBlob(int i) {
        return this.d.getBlob(i);
    }

    @Override // android.database.Cursor
    public final int getColumnCount() {
        return this.d.getColumnCount();
    }

    @Override // android.database.Cursor
    public final int getColumnIndex(String str) {
        return this.d.getColumnIndex(str);
    }

    @Override // android.database.Cursor
    public final int getColumnIndexOrThrow(String str) {
        return this.d.getColumnIndexOrThrow(str);
    }

    @Override // android.database.Cursor
    public final String getColumnName(int i) {
        return this.d.getColumnName(i);
    }

    @Override // android.database.Cursor
    public final String[] getColumnNames() {
        return this.d.getColumnNames();
    }

    @Override // android.database.Cursor
    public final int getCount() {
        if (this.h) {
            return this.d.getCount();
        }
        this.h = true;
        return ((Number) this.e.a(this.g, new C0391b())).intValue();
    }

    @Override // android.database.Cursor
    public final double getDouble(int i) {
        return this.d.getDouble(i);
    }

    @Override // android.database.Cursor
    public final Bundle getExtras() {
        return this.d.getExtras();
    }

    @Override // android.database.Cursor
    public final float getFloat(int i) {
        return this.d.getFloat(i);
    }

    @Override // android.database.Cursor
    public final int getInt(int i) {
        return this.d.getInt(i);
    }

    @Override // android.database.Cursor
    public final long getLong(int i) {
        return this.d.getLong(i);
    }

    @Override // android.database.Cursor
    public final Uri getNotificationUri() {
        return this.d.getNotificationUri();
    }

    @Override // android.database.Cursor
    public final int getPosition() {
        return this.d.getPosition();
    }

    @Override // android.database.Cursor
    public final short getShort(int i) {
        return this.d.getShort(i);
    }

    @Override // android.database.Cursor
    public final String getString(int i) {
        return this.d.getString(i);
    }

    @Override // android.database.Cursor
    public final int getType(int i) {
        return this.d.getType(i);
    }

    @Override // android.database.Cursor
    public final boolean getWantsAllOnMoveCalls() {
        return this.d.getWantsAllOnMoveCalls();
    }

    @Override // android.database.CrossProcessCursor
    public final CursorWindow getWindow() {
        return this.d.getWindow();
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
        return this.d.isAfterLast();
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
        return this.d.isBeforeFirst();
    }

    @Override // android.database.Cursor
    public final boolean isClosed() {
        return this.d.isClosed();
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
        return this.d.isFirst();
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
        return this.d.isLast();
    }

    @Override // android.database.Cursor
    public final boolean isNull(int i) {
        return this.d.isNull(i);
    }

    @Override // android.database.Cursor
    public final boolean move(int i) {
        return this.d.move(i);
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
        return this.d.moveToFirst();
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
        return this.d.moveToLast();
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
        return this.d.moveToNext();
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int i) {
        return this.d.moveToPosition(i);
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
        return this.d.moveToPrevious();
    }

    @Override // android.database.CrossProcessCursor
    public final boolean onMove(int i, int i2) {
        if (this.h) {
            return this.d.onMove(i, i2);
        }
        this.h = true;
        return ((Boolean) this.e.a(this.g, new c(i, i2))).booleanValue();
    }

    @Override // android.database.Cursor
    public final void registerContentObserver(ContentObserver contentObserver) {
        this.d.registerContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        this.d.registerDataSetObserver(dataSetObserver);
    }

    @Override // android.database.Cursor
    public final boolean requery() {
        return this.d.requery();
    }

    @Override // android.database.Cursor
    public final Bundle respond(Bundle bundle) {
        return this.d.respond(bundle);
    }

    @Override // android.database.Cursor
    public final void setExtras(Bundle bundle) {
        this.d.setExtras(bundle);
    }

    @Override // android.database.Cursor
    public final void setNotificationUri(ContentResolver contentResolver, Uri uri) {
        this.d.setNotificationUri(contentResolver, uri);
    }

    @Override // android.database.Cursor
    public final void unregisterContentObserver(ContentObserver contentObserver) {
        this.d.unregisterContentObserver(contentObserver);
    }

    @Override // android.database.Cursor
    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        this.d.unregisterDataSetObserver(dataSetObserver);
    }
}
