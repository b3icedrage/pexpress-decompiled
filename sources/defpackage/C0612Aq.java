package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Aq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0612Aq extends F80 {
    public String N;

    @Nullable
    public LinkedHashMap O;

    @Nullable
    public LinkedHashMap P;

    @Nullable
    public LinkedHashMap Q;

    @Nullable
    public LinkedHashMap R;

    @NotNull
    public String a() {
        String str = this.N;
        if (str != null) {
            return str;
        }
        Intrinsics.l("eventType");
        throw null;
    }

    public boolean b() {
        return (this.a == null && this.b == null) ? false : true;
    }
}
