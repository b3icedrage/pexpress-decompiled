package io.sentry.clientreport;

import defpackage.C2688aH1;
import defpackage.C3537eG1;
import defpackage.CG1;
import defpackage.EnumC5932pS;
import defpackage.MG1;
import defpackage.N7;
import defpackage.NG1;
import defpackage.RG1;
import defpackage.VG1;
import io.sentry.protocol.B;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements g {

    @NotNull
    public final a a = new a();

    @NotNull
    public final C2688aH1 b;

    public d(@NotNull C2688aH1 c2688aH1) {
        this.b = c2688aH1;
    }

    public static EnumC5932pS f(MG1 mg1) {
        if (MG1.Event.equals(mg1)) {
            return EnumC5932pS.Error;
        }
        if (MG1.Session.equals(mg1)) {
            return EnumC5932pS.Session;
        }
        if (MG1.Transaction.equals(mg1)) {
            return EnumC5932pS.Transaction;
        }
        if (MG1.UserFeedback.equals(mg1)) {
            return EnumC5932pS.UserReport;
        }
        if (MG1.Feedback.equals(mg1)) {
            return EnumC5932pS.Feedback;
        }
        if (MG1.Profile.equals(mg1)) {
            return EnumC5932pS.Profile;
        }
        if (MG1.ProfileChunk.equals(mg1)) {
            return EnumC5932pS.ProfileChunkUi;
        }
        if (MG1.Attachment.equals(mg1)) {
            return EnumC5932pS.Attachment;
        }
        if (MG1.CheckIn.equals(mg1)) {
            return EnumC5932pS.Monitor;
        }
        if (MG1.ReplayVideo.equals(mg1)) {
            return EnumC5932pS.Replay;
        }
        if (MG1.Log.equals(mg1)) {
            return EnumC5932pS.LogItem;
        }
        if (MG1.Span.equals(mg1)) {
            return EnumC5932pS.Span;
        }
        return MG1.TraceMetric.equals(mg1) ? EnumC5932pS.TraceMetric : EnumC5932pS.Default;
    }

    @Override // io.sentry.clientreport.g
    public final void a(@NotNull e eVar, @NotNull EnumC5932pS enumC5932pS) {
        e(eVar, enumC5932pS, 1L);
    }

    @Override // io.sentry.clientreport.g
    public final void b(@NotNull e eVar, @Nullable C3537eG1 c3537eG1) {
        if (c3537eG1 == null) {
            return;
        }
        try {
            Iterator it = c3537eG1.b.iterator();
            while (it.hasNext()) {
                d(eVar, (CG1) it.next());
            }
        } catch (Throwable th) {
            this.b.getLogger().c(NG1.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.g
    @NotNull
    public final C3537eG1 c(@NotNull C3537eG1 c3537eG1) {
        C2688aH1 c2688aH1 = this.b;
        Date dateH = N7.h();
        a aVar = this.a;
        aVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<c, AtomicLong> entry : aVar.a.a().entrySet()) {
            long andSet = entry.getValue().getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new f(entry.getKey().a, entry.getKey().b, lValueOf));
            }
        }
        b bVar = arrayList.isEmpty() ? null : new b(dateH, arrayList);
        if (bVar == null) {
            return c3537eG1;
        }
        try {
            c2688aH1.getLogger().a(NG1.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = c3537eG1.b.iterator();
            while (it.hasNext()) {
                arrayList2.add((CG1) it.next());
            }
            arrayList2.add(CG1.b(c2688aH1.getSerializer(), bVar));
            return new C3537eG1(c3537eG1.a, arrayList2);
        } catch (Throwable th) {
            c2688aH1.getLogger().c(NG1.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return c3537eG1;
        }
    }

    @Override // io.sentry.clientreport.g
    public final void d(@NotNull e eVar, @Nullable CG1 cg1) {
        C2688aH1 c2688aH1 = this.b;
        if (cg1 == null) {
            return;
        }
        try {
            MG1 mg1 = cg1.a.i;
            if (MG1.ClientReport.equals(mg1)) {
                try {
                    i(cg1.e(c2688aH1.getSerializer()));
                    return;
                } catch (Exception unused) {
                    c2688aH1.getLogger().a(NG1.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            EnumC5932pS enumC5932pSF = f(mg1);
            if (enumC5932pSF.equals(EnumC5932pS.Transaction)) {
                B bI = cg1.i(c2688aH1.getSerializer());
                if (bI != null) {
                    ArrayList arrayList = bI.w;
                    h(eVar.getReason(), EnumC5932pS.Span.getCategory(), Long.valueOf(((long) arrayList.size()) + 1));
                    arrayList.size();
                    g();
                }
                h(eVar.getReason(), enumC5932pSF.getCategory(), 1L);
                g();
                return;
            }
            if (enumC5932pSF.equals(EnumC5932pS.LogItem)) {
                RG1 rg1G = cg1.g(c2688aH1.getSerializer());
                if (rg1G == null) {
                    c2688aH1.getLogger().a(NG1.ERROR, "Unable to parse lost logs envelope item.", new Object[0]);
                    return;
                }
                h(eVar.getReason(), enumC5932pSF.getCategory(), Long.valueOf(rg1G.d.size()));
                h(eVar.getReason(), EnumC5932pS.LogByte.getCategory(), Long.valueOf(cg1.f().length));
                g();
                return;
            }
            if (!enumC5932pSF.equals(EnumC5932pS.TraceMetric)) {
                h(eVar.getReason(), enumC5932pSF.getCategory(), 1L);
                g();
                return;
            }
            VG1 vg1H = cg1.h(c2688aH1.getSerializer());
            if (vg1H == null) {
                c2688aH1.getLogger().a(NG1.ERROR, "Unable to parse lost metrics envelope item.", new Object[0]);
                return;
            }
            h(eVar.getReason(), enumC5932pSF.getCategory(), Long.valueOf(vg1H.d.size()));
            g();
        } catch (Throwable th) {
            c2688aH1.getLogger().c(NG1.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.g
    public final void e(@NotNull e eVar, @NotNull EnumC5932pS enumC5932pS, long j) {
        try {
            h(eVar.getReason(), enumC5932pS.getCategory(), Long.valueOf(j));
            g();
        } catch (Throwable th) {
            this.b.getLogger().c(NG1.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    public final void g() {
        this.b.getOnDiscard();
    }

    public final void h(@NotNull String str, @NotNull String str2, @NotNull Long l) {
        AtomicLong atomicLong = this.a.a.a().get(new c(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l.longValue());
        }
    }

    public final void i(@Nullable b bVar) {
        if (bVar == null) {
            return;
        }
        for (f fVar : bVar.e) {
            h(fVar.d, fVar.e, fVar.g);
        }
    }
}
