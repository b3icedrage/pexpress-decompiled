package defpackage;

import java.util.regex.Matcher;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class N3 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object g;

    public /* synthetic */ N3(int i, Object obj, Object obj2) {
        this.d = i;
        this.e = obj;
        this.g = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj = this.g;
        Object obj2 = this.e;
        switch (this.d) {
            case 0:
                O3 o3 = (O3) obj2;
                o3.getClass();
                InterfaceC1442Lg1 interfaceC1442Lg1 = (InterfaceC1442Lg1) obj;
                Intrinsics.checkNotNullParameter(interfaceC1442Lg1, "<this>");
                return new O3.a(interfaceC1442Lg1.a(o3));
            default:
                Regex.Companion companion = Regex.INSTANCE;
                String input = (String) obj;
                Intrinsics.checkNotNullParameter(input, "input");
                Matcher matcher = ((Regex) obj2).d.matcher(input);
                Intrinsics.checkNotNullExpressionValue(matcher, "matcher(...)");
                if (matcher.find(0)) {
                    return new C6367rX0(matcher, input);
                }
                return null;
        }
    }
}
