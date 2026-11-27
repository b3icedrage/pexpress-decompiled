package defpackage;

import com.appsflyer.sdk_base.util.AndroidExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;

/* JADX INFO: renamed from: lb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5117lb implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ C5117lb(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                return AndroidExtensionsKt.bytesToUpperHexString$lambda$0(((Byte) obj).byteValue());
            case 1:
                C2701aM.a install = (C2701aM.a) obj;
                Intrinsics.checkNotNullParameter(install, "$this$install");
                C3120cH0 format = C3749fH0.a(new C6433rp(0));
                int i = GH0.a;
                C4651jM contentTypeToSend = C4651jM.a.a;
                Intrinsics.checkNotNullParameter(install, "<this>");
                Intrinsics.checkNotNullParameter(format, "json");
                Intrinsics.checkNotNullParameter(contentTypeToSend, "contentType");
                Intrinsics.checkNotNullParameter(install, "<this>");
                Intrinsics.checkNotNullParameter(contentTypeToSend, "contentType");
                Intrinsics.checkNotNullParameter(format, "format");
                AL0 converter = new AL0(format);
                install.getClass();
                Intrinsics.checkNotNullParameter(contentTypeToSend, "contentType");
                Intrinsics.checkNotNullParameter(converter, "converter");
                LI configuration = LI.e;
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                InterfaceC4861kM contentTypeMatcher = Intrinsics.a(contentTypeToSend, contentTypeToSend) ? C7787yG0.a : new C2925bM(contentTypeToSend);
                Intrinsics.checkNotNullParameter(contentTypeToSend, "contentTypeToSend");
                Intrinsics.checkNotNullParameter(converter, "converter");
                Intrinsics.checkNotNullParameter(contentTypeMatcher, "contentTypeMatcher");
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                configuration.invoke(converter);
                install.b.add(new C2701aM.a.C0214a(converter, contentTypeToSend, contentTypeMatcher));
                return Unit.a;
            default:
                Sequence it = (Sequence) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return it.iterator();
        }
    }
}
