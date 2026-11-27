package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: yG0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7787yG0 implements InterfaceC4861kM {

    @NotNull
    public static final C7787yG0 a = new C7787yG0();

    @Override // defpackage.InterfaceC4861kM
    public final boolean a(@NotNull C4651jM contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        if (contentType.b(C4651jM.a.a)) {
            return true;
        }
        if (!contentType.b.isEmpty()) {
            contentType = new C4651jM(contentType.c, contentType.d, C5653o60.d);
        }
        String string = contentType.toString();
        return d.o(string, "application/", false) && d.h(string, "+json", false);
    }
}
