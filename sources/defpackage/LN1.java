package defpackage;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class LN1 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1454Lk1 d;
    public final InterfaceC5331mb0 e;

    public LN1(LL ll, C6994uW0 c6994uW0, InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1454Lk1 interfaceC1454Lk2, C2518Yq1 c2518Yq1) {
        this.b = c6994uW0;
        this.c = interfaceC1454Lk1;
        this.d = interfaceC1454Lk2;
        this.e = c2518Yq1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                Map delegates = (Map) ((C6994uW0) this.b).get();
                C0802Db0 fallbackDelegate = (C0802Db0) ((InterfaceC1454Lk1) this.c).get();
                C3903g11 parser = (C3903g11) this.d.get();
                OZ0 messageObfuscator = (OZ0) ((C2518Yq1) this.e).get();
                Intrinsics.checkNotNullParameter(delegates, "delegates");
                Intrinsics.checkNotNullParameter(fallbackDelegate, "fallbackDelegate");
                Intrinsics.checkNotNullParameter(parser, "parser");
                Intrinsics.checkNotNullParameter(messageObfuscator, "messageObfuscator");
                return new KN1(delegates, fallbackDelegate, parser, messageObfuscator);
            default:
                return new C3916g42((C6530sH1) this.b.get(), (C0831Dl) this.c.get(), (GX1) ((C3181cb0) this.d).get(), (BB1) ((OW) this.e).get());
        }
    }

    public LN1(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C3181cb0 c3181cb0, OW ow) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = c3181cb0;
        this.e = ow;
    }
}
