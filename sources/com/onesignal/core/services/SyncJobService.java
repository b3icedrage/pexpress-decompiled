package com.onesignal.core.services;

import android.app.job.JobParameters;
import android.app.job.JobService;
import defpackage.AW1;
import defpackage.C1795Pt1;
import defpackage.C3027bp1;
import defpackage.C7766y91;
import defpackage.InterfaceC2442Xr0;
import defpackage.InterfaceC3368dU;
import defpackage.JM;
import defpackage.LY1;
import defpackage.MN;
import defpackage.NS0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Lcom/onesignal/core/services/SyncJobService;", "Landroid/app/job/JobService;", "()V", "onStartJob", "", "jobParameters", "Landroid/app/job/JobParameters;", "onStopJob", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SyncJobService extends JobService {

    @InterfaceC3368dU(c = "com.onesignal.core.services.SyncJobService$onStartJob$1", f = "SyncJobService.kt", l = {45}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends AW1 implements Function1<JM<? super Unit>, Object> {
        final /* synthetic */ C3027bp1<InterfaceC2442Xr0> $backgroundService;
        final /* synthetic */ JobParameters $jobParameters;
        int label;
        final /* synthetic */ SyncJobService this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C3027bp1<InterfaceC2442Xr0> c3027bp1, SyncJobService syncJobService, JobParameters jobParameters, JM<? super a> jm) {
            super(1, jm);
            this.$backgroundService = c3027bp1;
            this.this$0 = syncJobService;
            this.$jobParameters = jobParameters;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@NotNull JM<?> jm) {
            return new a(this.$backgroundService, this.this$0, this.$jobParameters, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final Object invoke(@Nullable JM<? super Unit> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            int i = this.label;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC2442Xr0 interfaceC2442Xr0 = this.$backgroundService.d;
                this.label = 1;
                if (interfaceC2442Xr0.runBackgroundServices(this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            NS0.debug$default("LollipopSyncRunnable:JobFinished needsJobReschedule: " + this.$backgroundService.d.getNeedsJobReschedule(), null, 2, null);
            boolean needsJobReschedule = this.$backgroundService.d.getNeedsJobReschedule();
            this.$backgroundService.d.setNeedsJobReschedule(false);
            this.this$0.jobFinished(this.$jobParameters, needsJobReschedule);
            return Unit.a;
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Object] */
    @Override // android.app.job.JobService
    public boolean onStartJob(@NotNull JobParameters jobParameters) {
        Intrinsics.checkNotNullParameter(jobParameters, "jobParameters");
        if (!C7766y91.c(this)) {
            return false;
        }
        C3027bp1 c3027bp1 = new C3027bp1();
        c3027bp1.d = C7766y91.b().getService(InterfaceC2442Xr0.class);
        LY1.suspendifyOnThread$default(0, new a(c3027bp1, this, jobParameters, null), 1, null);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@NotNull JobParameters jobParameters) {
        Intrinsics.checkNotNullParameter(jobParameters, "jobParameters");
        boolean zCancelRunBackgroundServices = ((InterfaceC2442Xr0) C7766y91.b().getService(InterfaceC2442Xr0.class)).cancelRunBackgroundServices();
        NS0.debug$default("SyncJobService onStopJob called, system conditions not available reschedule: " + zCancelRunBackgroundServices, null, 2, null);
        return zCancelRunBackgroundServices;
    }
}
