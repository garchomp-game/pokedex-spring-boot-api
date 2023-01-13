let SessionLoad = 1
let s:so_save = &g:so | let s:siso_save = &g:siso | setg so=0 siso=0 | setl so=-1 siso=-1
let v:this_session=expand("<sfile>:p")
silent only
silent tabonly
cd ~/workspace/pokemon_community_app/myapp
if expand('%') == '' && !&modified && line('$') <= 1 && getline(1) == ''
  let s:wipebuf = bufnr('%')
endif
let s:shortmess_save = &shortmess
if &shortmess =~ 'A'
  set shortmess=aoOA
else
  set shortmess=aoO
endif
badd +1 src/main/java/com/example/myapp/property/pokedex/status/Status.java
badd +4 src/main/java/com/example/myapp/property/pokedex/status/StatusBase.java
badd +1 src/main/resources/pokedex/pokedex/Red_Green_Blue_Yellow/Red_Green_Blue_Yellow.json
badd +19 src/main/java/com/example/myapp/controller/pokedex/PokedexController.java
badd +1 src/main/resources/pokedex/pokedex/Black2_White2/Black2_White2.json
badd +1 ~/workspace/pokemon_community_app/memo.txt
badd +74 ~/workspace/pokemon_community_app/memo.md
badd +13 src/main/java/com/example/myapp/controller/pokedex/StatusController.java
badd +1 src/main/resources/pokedex/translate/translate.json
badd +1 src/main/resources/pokedex/type/list.json
badd +1 src/main/resources/pokedex/type/type.json
badd +1 src/main/resources/pokedex/pokedex/pokedex.json
badd +1 src/main/resources/pokedex/convert/local_global_id_converter.json
badd +3 src/main/java/com/example/myapp/property/pokedex/Pokedex.java
badd +1 src/main/resources/pokedex/pokedex/X_Y/X_Y.json
badd +4 src/main/java/com/example/myapp/property/convert/Convert.java
badd +3 src/main/java/com/example/myapp/property/convert/ConverterItem.java
badd +6 src/main/java/com/example/myapp/property/pokedex/status/PokemonStatus.java
badd +1 .
badd +9 src/main/java/com/example/myapp/property/translate/TransLateBase.java
badd +8 src/main/java/com/example/myapp/property/translate/Translate.java
badd +1 ~/workspace/pokemon_community_app/myapp/src/main/java/com/example/myapp/service/ConvertService.java
badd +6 ~/workspace/pokemon_community_app/myapp/src/main/java/com/example/myapp/service/TranslateService.java
badd +1 ~/workspace/pokemon_community_app/myapp/src/main/java/com/example/myapp/service/StatusService.java
badd +12 ~/workspace/pokemon_community_app/myapp/src/main/java/com/example/myapp/service/PokedexService.java
badd +30 ~/workspace/pokemon_community_app/myapp/src/main/java/com/example/myapp/controller/translate/TranslateController.java
argglobal
%argdel
set lines=49 columns=191
tabnew +setlocal\ bufhidden=wipe
tabrewind
edit ~/workspace/pokemon_community_app/myapp/src/main/java/com/example/myapp/controller/translate/TranslateController.java
let s:save_splitbelow = &splitbelow
let s:save_splitright = &splitright
set splitbelow splitright
wincmd _ | wincmd |
vsplit
1wincmd h
wincmd w
let &splitbelow = s:save_splitbelow
let &splitright = s:save_splitright
wincmd t
let s:save_winminheight = &winminheight
let s:save_winminwidth = &winminwidth
set winminheight=0
set winheight=1
set winminwidth=0
set winwidth=1
exe 'vert 1resize ' . ((&columns * 95 + 95) / 191)
exe 'vert 2resize ' . ((&columns * 95 + 95) / 191)
argglobal
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 31 - ((30 * winheight(0) + 23) / 46)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 31
normal! 03|
wincmd w
argglobal
if bufexists(fnamemodify("~/workspace/pokemon_community_app/myapp/src/main/java/com/example/myapp/service/TranslateService.java", ":p")) | buffer ~/workspace/pokemon_community_app/myapp/src/main/java/com/example/myapp/service/TranslateService.java | else | edit ~/workspace/pokemon_community_app/myapp/src/main/java/com/example/myapp/service/TranslateService.java | endif
if &buftype ==# 'terminal'
  silent file ~/workspace/pokemon_community_app/myapp/src/main/java/com/example/myapp/service/TranslateService.java
endif
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 6 - ((5 * winheight(0) + 23) / 46)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 6
normal! 0
wincmd w
2wincmd w
exe 'vert 1resize ' . ((&columns * 95 + 95) / 191)
exe 'vert 2resize ' . ((&columns * 95 + 95) / 191)
tabnext
edit src/main/resources/pokedex/pokedex/X_Y/X_Y.json
argglobal
setlocal fdm=manual
setlocal fde=0
setlocal fmr={{{,}}}
setlocal fdi=#
setlocal fdl=0
setlocal fml=1
setlocal fdn=20
setlocal fen
silent! normal! zE
let &fdl = &fdl
let s:l = 6158 - ((22 * winheight(0) + 23) / 46)
if s:l < 1 | let s:l = 1 | endif
keepjumps exe s:l
normal! zt
keepjumps 6158
normal! 029|
tabnext 1
if exists('s:wipebuf') && len(win_findbuf(s:wipebuf)) == 0 && getbufvar(s:wipebuf, '&buftype') isnot# 'terminal'
  silent exe 'bwipe ' . s:wipebuf
endif
unlet! s:wipebuf
set winheight=1 winwidth=20
let &shortmess = s:shortmess_save
let s:sx = expand("<sfile>:p:r")."x.vim"
if filereadable(s:sx)
  exe "source " . fnameescape(s:sx)
endif
let &g:so = s:so_save | let &g:siso = s:siso_save
set hlsearch
nohlsearch
doautoall SessionLoadPost
unlet SessionLoad
" vim: set ft=vim :
