package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: uH0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6949uH0 extends AbstractC5418n0 {

    @NotNull
    public final JsonElement e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6949uH0(@NotNull AbstractC5267mG0 json, @NotNull JsonElement value) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.e = value;
        this.a.add("primitive");
    }

    @Override // defpackage.AbstractC5418n0
    @NotNull
    public final JsonElement U(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        if (tag == "primitive") {
            return this.e;
        }
        throw new IllegalArgumentException("This input can only handle primitives with 'primitive' tag");
    }

    @Override // defpackage.AbstractC5418n0
    @NotNull
    public final JsonElement X() {
        return this.e;
    }

    @Override // defpackage.EH
    public final int h(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return 0;
    }
}
