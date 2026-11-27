package defpackage;

import com.api.core.backend.domain.models.resultModels.ResultOk;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ds1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0854Ds1 implements InterfaceC6444rs1 {

    @NotNull
    public final C7641xb0 a;

    @NotNull
    public final InterfaceC6444rs1 b;

    public C0854Ds1(@NotNull C7641xb0 fakeChartPointsUseCaseBase, @NotNull InterfaceC6444rs1 requestCandlesHistoryUseCase) {
        Intrinsics.checkNotNullParameter(fakeChartPointsUseCaseBase, "fakeChartPointsUseCaseBase");
        Intrinsics.checkNotNullParameter(requestCandlesHistoryUseCase, "requestCandlesHistoryUseCase");
        this.a = fakeChartPointsUseCaseBase;
        this.b = requestCandlesHistoryUseCase;
    }

    @Override // defpackage.InterfaceC6444rs1
    @Nullable
    public final Object a(@NotNull String str, long j, long j2, int i, int i2, @NotNull JM jm) {
        return this.b.a(str, j, j2, i, i2, jm);
    }

    @Override // defpackage.InterfaceC6444rs1
    @Nullable
    public final Object b(@NotNull String str, long j, long j2, @NotNull JM jm) {
        int iAbs = (int) Math.abs(j - j2);
        C7641xb0 c7641xb0 = this.a;
        c7641xb0.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        double d = c7641xb0.b;
        ArrayList arrayList = new ArrayList(iAbs);
        int i = 0;
        while (i < iAbs) {
            i++;
            long jL = jCurrentTimeMillis - (b.l(C7641xb0.c) * ((long) i));
            C7641xb0 c7641xb1 = c7641xb0;
            float f = C7641xb0.c(c7641xb1, c7641xb0.b, d, "123").c;
            double d2 = f;
            Unit unit = Unit.a;
            arrayList.add(new BF(jL, jL, f, 0.0f, 0.0f));
            c7641xb0 = c7641xb1;
            d = d2;
        }
        return new ResultOk(arrayList);
    }

    @Override // defpackage.InterfaceC6444rs1
    @Nullable
    public final Object c(@NotNull String str, long j, long j2, @NotNull C5520nU1 c5520nU1) {
        return this.b.c(str, j, j2, c5520nU1);
    }
}
