package defpackage;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: x71, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7548x71 extends ML0 implements Function0<String> {
    public final /* synthetic */ String d;
    public final /* synthetic */ C7758y71<Object> e;
    public final /* synthetic */ int g;
    public final /* synthetic */ InterfaceC6707t71 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7548x71(String str, C7758y71<Object> c7758y71, int i, InterfaceC6707t71 interfaceC6707t71) {
        super(0);
        this.d = str;
        this.e = c7758y71;
        this.g = i;
        this.h = interfaceC6707t71;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        return "Can not interpret the string '" + this.d + "' as " + this.e.a.get(this.g).b + ": " + this.h.a();
    }
}
