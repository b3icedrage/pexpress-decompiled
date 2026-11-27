package defpackage;

import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: pY0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5951pY0 extends ML0 implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5951pY0(int i, Object obj, Object obj2) {
        super(1);
        this.d = i;
        this.g = obj;
        this.e = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    ((C6370rY0) this.g).c.b((String) this.e, AbstractC4688jY0.d.a);
                }
                return Unit.a;
            case 1:
                C3179ca2 state = (C3179ca2) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                HashMap files = new HashMap();
                files.putAll(state.a);
                for (Map.Entry entry : files.entrySet()) {
                    String str = (String) entry.getKey();
                    C2980bd0 c2980bd0 = (C2980bd0) entry.getValue();
                    String str2 = (String) this.e;
                    if (Intrinsics.a(str, str2)) {
                        files.put(str2, C2980bd0.a(c2980bd0, new AbstractC5539na2.a((String) this.g)));
                        Intrinsics.checkNotNullParameter(files, "files");
                        return new C3179ca2(files);
                    }
                }
                Intrinsics.checkNotNullParameter(files, "files");
                return new C3179ca2(files);
            default:
                C3441do0 buildHeaders = (C3441do0) obj;
                Intrinsics.checkNotNullParameter(buildHeaders, "$this$buildHeaders");
                C3651eo0 stringValues = (C3651eo0) this.g;
                buildHeaders.getClass();
                Intrinsics.checkNotNullParameter(stringValues, "stringValues");
                stringValues.b(new C7824yS1(buildHeaders));
                InterfaceC2586Zn0 stringValues2 = ((AbstractC1112Ha1) this.e).c();
                Intrinsics.checkNotNullParameter(stringValues2, "stringValues");
                stringValues2.b(new C7824yS1(buildHeaders));
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5951pY0(String str, String str2) {
        super(1);
        this.d = 1;
        this.e = str;
        this.g = str2;
    }
}
