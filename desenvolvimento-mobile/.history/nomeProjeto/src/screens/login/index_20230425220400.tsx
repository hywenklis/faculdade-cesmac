import * as React from 'react';
import { View, Text, ImageBackground } from 'react-native';
import {imagemFundo} from './../../../assets/imgs/background.png';

export interface LoginScreenProps {
}

// export function LoginScreen(props: LoginScreenProps) {
//   return (
//     <View>
//       <Text>Login Screen</Text>
//     </View>
//   );
// }

export function componente() {
  return (<ImageBackground source={imagemFundo}>
    </ImageBackground>)
}
