package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import com.impl.core.backend.DepositMadeWorker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Zq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2594Zq extends Xk2 {

    @NotNull
    public final DepositMadeWorker.a b;

    public C2594Zq(@NotNull DepositMadeWorker.a depositMadeWorkerFactory) {
        Intrinsics.checkNotNullParameter(depositMadeWorkerFactory, "depositMadeWorkerFactory");
        this.b = depositMadeWorkerFactory;
    }

    @Override // defpackage.Xk2
    @Nullable
    public final c a(@NotNull Context appContext, @NotNull String workerClassName, @NotNull WorkerParameters workerParameters) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerClassName, "workerClassName");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        if (Intrinsics.a(workerClassName, DepositMadeWorker.class.getName())) {
            return this.b.a(appContext, workerParameters);
        }
        return null;
    }
}
