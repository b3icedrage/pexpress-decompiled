package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class LH0 extends AbstractC5418n0 {

    @NotNull
    public final JsonArray e;
    public final int f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LH0(@NotNull AbstractC5267mG0 json, @NotNull JsonArray value) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(value, "value");
        this.e = value;
        this.f = value.d.size();
        this.g = -1;
    }

    @Override // defpackage.AbstractC7317w21
    @NotNull
    public final String S(@NotNull MH1 descriptor, int i) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return String.valueOf(i);
    }

    @Override // defpackage.AbstractC5418n0
    @NotNull
    public final JsonElement U(@NotNull String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return this.e.d.get(Integer.parseInt(tag));
    }

    @Override // defpackage.AbstractC5418n0
    public final JsonElement X() {
        return this.e;
    }

    @Override // defpackage.EH
    public final int h(@NotNull MH1 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int i = this.g;
        if (i >= this.f - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.g = i2;
        return i2;
    }
}
