package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4882kT {

    @NotNull
    public final Context a;

    @Nullable
    public final String b;

    @NotNull
    public final InterfaceC3376dW1.c c;

    @NotNull
    public final QA1.d d;

    @Nullable
    public final ArrayList e;
    public final boolean f;

    @NotNull
    public final QA1.c g;

    @NotNull
    public final Executor h;

    @NotNull
    public final Executor i;
    public final boolean j;
    public final boolean k;

    @Nullable
    public final LinkedHashSet l;

    @NotNull
    public final ArrayList m;

    @NotNull
    public final ArrayList n;

    @SuppressLint({"LambdaLast"})
    public C4882kT(@NotNull Context context, @Nullable String str, @NotNull InterfaceC3376dW1.c sqliteOpenHelperFactory, @NotNull QA1.d migrationContainer, @Nullable ArrayList arrayList, boolean z, @NotNull QA1.c journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z2, boolean z3, @Nullable LinkedHashSet linkedHashSet, @NotNull ArrayList typeConverters, @NotNull ArrayList autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.a = context;
        this.b = str;
        this.c = sqliteOpenHelperFactory;
        this.d = migrationContainer;
        this.e = arrayList;
        this.f = z;
        this.g = journalMode;
        this.h = queryExecutor;
        this.i = transactionExecutor;
        this.j = z2;
        this.k = z3;
        this.l = linkedHashSet;
        this.m = typeConverters;
        this.n = autoMigrationSpecs;
    }
}
