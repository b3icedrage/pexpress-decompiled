package defpackage;

import io.sentry.android.replay.capture.AbstractC4515a;
import io.sentry.android.replay.k;
import io.sentry.android.replay.u;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: vc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7225vc1 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7225vc1(Object obj, Object obj2, Object obj3, int i) {
        super(0);
        this.d = i;
        this.e = obj;
        this.g = obj2;
        this.h = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                StringBuilder sb = new StringBuilder("Attempting to assign conflicting values '");
                sb.append(this.e);
                sb.append("' and '");
                sb.append(this.g);
                sb.append("' to field '");
                return C1039Gc0.e(sb, AbstractC7107v21.this.c, '\'');
            default:
                u uVar = (u) this.g;
                if (uVar != null) {
                    AbstractC4515a abstractC4515a = (AbstractC4515a) this.h;
                    k kVar = abstractC4515a.h;
                    if (kVar != null) {
                        kVar.k("config.height", String.valueOf(uVar.b));
                    }
                    k kVar2 = abstractC4515a.h;
                    if (kVar2 != null) {
                        kVar2.k("config.width", String.valueOf(uVar.a));
                    }
                    k kVar3 = abstractC4515a.h;
                    if (kVar3 != null) {
                        kVar3.k("config.frame-rate", String.valueOf(uVar.e));
                    }
                    k kVar4 = abstractC4515a.h;
                    if (kVar4 != null) {
                        kVar4.k("config.bit-rate", String.valueOf(uVar.f));
                    }
                }
                return Unit.a;
        }
    }
}
