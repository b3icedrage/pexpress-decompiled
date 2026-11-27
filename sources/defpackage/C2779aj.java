package defpackage;

import io.jsonwebtoken.JwtParser;
import io.sentry.android.replay.capture.AbstractC4515a;
import io.sentry.android.replay.capture.D;
import io.sentry.android.replay.capture.p;
import io.sentry.android.replay.capture.q;
import io.sentry.android.replay.capture.r;
import io.sentry.android.replay.util.i;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: aj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2779aj implements MD1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C2779aj(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.MD1
    public final void e(InterfaceC1015Fu0 scope) {
        Object obj = this.e;
        switch (this.d) {
            case 0:
                Intrinsics.checkNotNullParameter(scope, "scope");
                C6289r8 c6289r8 = (C6289r8) obj;
                scope.m(c6289r8.b);
                for (Map.Entry entry : (C5525nW0) c6289r8.c.entrySet()) {
                    scope.b((String) entry.getKey(), (String) entry.getValue());
                }
                for (Map.Entry entry2 : (C5525nW0) c6289r8.d.entrySet()) {
                    scope.n((String) entry2.getKey(), entry2.getValue().toString());
                }
                break;
            case 1:
                Intrinsics.checkNotNullParameter(scope, "scope");
                C5315mW0 builder = new C5315mW0();
                C4993kz1 c4993kz1 = (C4993kz1) obj;
                builder.put("session_id", c4993kz1.a);
                builder.put("account_type", c4993kz1.b);
                String str = c4993kz1.c;
                if (str != null) {
                    builder.put("asset", str);
                }
                Integer num = c4993kz1.d;
                if (num != null) {
                    builder.put("timeframe_s", num);
                }
                String str2 = c4993kz1.e;
                if (str2 != null) {
                    builder.put("strategy", str2);
                }
                String str3 = c4993kz1.f;
                if (str3 != null) {
                    builder.put("indicator", str3);
                }
                Double d = c4993kz1.g;
                if (d != null) {
                    builder.put("start_amount", d);
                }
                String str4 = c4993kz1.h;
                if (str4 != null) {
                    builder.put("amount_currency", str4);
                }
                Double d2 = c4993kz1.i;
                if (d2 != null) {
                    builder.put("start_balance", d2);
                }
                String str5 = c4993kz1.j;
                if (str5 != null) {
                    builder.put("balance_currency", str5);
                }
                builder.put("started_at_epoch_ms", Long.valueOf(c4993kz1.k));
                Unit unit = Unit.a;
                Intrinsics.checkNotNullParameter(builder, "builder");
                scope.E(builder.c(), "robot_session");
                break;
            default:
                Intrinsics.checkNotNullParameter(scope, "it");
                D d3 = (D) obj;
                scope.o(d3.f());
                String strI = scope.I();
                String strW = strI != null ? StringsKt.W(JwtParser.SEPARATOR_CHAR, strI, strI) : null;
                IJ0<Object> property = AbstractC4515a.q[2];
                r rVar = d3.l;
                rVar.getClass();
                Intrinsics.checkNotNullParameter(property, "property");
                String andSet = rVar.a.getAndSet(strW);
                if (!Intrinsics.a(andSet, strW)) {
                    q qVar = new q(andSet, strW, rVar.c);
                    AbstractC4515a abstractC4515a = rVar.b;
                    if (abstractC4515a.a.getThreadChecker().c()) {
                        ((ScheduledExecutorService) abstractC4515a.e.getValue()).submit(new i(new p(qVar), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            qVar.invoke();
                        } catch (Throwable th) {
                            abstractC4515a.a.getLogger().d(NG1.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                        }
                    }
                }
                break;
        }
    }
}
